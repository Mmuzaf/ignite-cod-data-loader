/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.sbrf.gg.load

import java.io.{File, FileInputStream}
import java.util.concurrent.{ExecutorService, Executors, TimeUnit}

import org.apache.ignite.Ignite
import org.slf4j.LoggerFactory
import ru.sbrf.gg.load.Config.{GENERATE_CONFIG, LOAD_TABLE}

/**
  */
object MainApp extends App {
    private val logger = LoggerFactory.getLogger(this.getClass)

    val parser = new scopt.OptionParser[Config]("java -jar ignite-cod-data-loader.jar") {
        head("ignite-cod-data-loader", "0.0.1")

        cmd(GENERATE_CONFIG).action( (_, c) => c.copy(command = Some(GENERATE_CONFIG)) ).
            text("generates grid-gain config file using info from `servers-file` parameter. By default use server.csv from app resources.").
            children (
                opt[String]("servers-file").abbr("sf").action( (v, c) =>
                    c.copy(serversFile = Some(v)) ).text("path to csv file with servers info")
            )
        cmd(LOAD_TABLE).action( (_, c) => c.copy(command = Some(LOAD_TABLE)) ).
            text("loads table data to cluster.").
            children(
                opt[Unit]("local").abbr("l").action( (v, c) =>
                    c.copy(local = true) ).text("use config for local cluster"),
                opt[Unit]("cluster").abbr("c").action( (v, c) =>
                    c.copy(local = false) ).text("use config for test cluster"),
                opt[String]("data-root").abbr("dr").action( (v, c) =>
                    c.copy(dataRoot = Some(v)) ).text("data root directory or path to zip file"),
                opt[Int]("pool-size").abbr("ps").action( (v, c) =>
                    c.copy(poolSize = Some(v)) ).text("Size of thread pool to load files"),
                opt[String]("tables-index").abbr("ti").action( (v, c) =>
                    c.copy(tablesIndexes = v.split(",").map(_.toInt).toSet) ).text("Indexes of tables in config. See tables.csv, comma separated")
            )

        checkConfig { c =>
            c.command match {
                case Some(GENERATE_CONFIG) ⇒
                    if (c.serversFile.isEmpty || !new File(c.serversFile.get).exists())
                        failure(s"File ${c.serversFile.map(new File(_).getAbsoluteFile)} doesn't exists")
                    else
                        success
                case Some(LOAD_TABLE) ⇒
                    if (c.dataRoot.isEmpty)
                        failure(s"`data-root` is required parameters")
                    else
                        success
            }
        }
    }

    parser.parse(args, Config()) match {
        case Some(config) => config.command match {
            case Some(GENERATE_CONFIG) ⇒ generateAddressesConfig(config.serversFile.get)
            case Some(LOAD_TABLE) ⇒ loadTable(config.local, config.dataRoot, config.poolSize, config.tablesIndexes)
        }

        case None =>
    }

    def generateAddressesConfig(serversFile: String): Unit = {
        new CSVReader(new FileInputStream(serversFile)).foreach { line ⇒
            println(s"<value>${line(2)}:47500..47509</value>")
        }
    }

    def loadTable(local: Boolean, dataRoot: Option[String], poolSizeOption: Option[Int],
        tablesIndexes: Set[Int]): Unit = {
        val poolSize = poolSizeOption.getOrElse(8)

        val pool: ExecutorService = Executors.newFixedThreadPool(poolSize)

        logger.info(s"Loading tables using thread pool of size ${poolSize}, " +
            s"tablesIndexes = ${tablesIndexes.mkString(", ")}")

        printTables(dataRoot.get)

        val ignite: Ignite = startClient(local)

        try {
            new CSVReader(getClass.getResourceAsStream("/tables.csv")).foreach { line ⇒
                if (tablesIndexes(line(1).toInt))
                    new LoadTable(local, line(0), dataRoot.get, pool, ignite).load()
                else
                    logger.warn(s"Skipping table ${line(0)} of index ${line(1)}")
            }
        } finally {
            pool.shutdown()
            pool.awaitTermination(25, TimeUnit.HOURS)
            ignite.close()
        }
    }


    def printTables(dataRoot: String) = {
        val fileIterator = if (new File(dataRoot).isDirectory)
            directoryIterator(dataRoot)
        else
            zipIterator(dataRoot)

        val tables = fileIterator.filter(_._1.contains('_')).map(file ⇒ file._1.substring(0, file._1.lastIndexOf('_'))).toSet
        logger.info(s"==== KNOWN TABLES START - ${tables.size} ====")
        tables.foreach(logger.info)
        logger.info(s"====         KNOWN TABLES END            ====")
    }
}