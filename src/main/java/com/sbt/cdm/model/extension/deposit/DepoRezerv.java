/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.cdm.model.extension.deposit;

import ru.sbt.kmdtransform.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class DepoRezerv {

    @OraName(value = "id")
    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    @IdField(value="true")
    public Long id;


    @OraName(value = "colocationKey")
    @InitOrder(value = "2")
    @DataType(value = TransformType.LONG)
    @PartField(value="true")
    public Long colocationKey;

    @OraName(value = "clientid")
    @InitOrder(value = "3")
    @DataType(value = TransformType.LONG)
    @RootField(value="true")
    public Long rootParticle_DPL_id;

    @DataType(value = TransformType.ROOT)
    @Default(value = "0")
    public Long affinityParent_DPL_id;

//    @OraName(value = "templateId")
//    @DataType(value = TransformType.LONG)
//    public Long templateId;

    @OraName(value = "operationid")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public Long operationRun_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "operationRun_DPL_id")
    @Default(value = "0")
    public Long operationRun_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "operationRun_DPL_id")
    @Default(value = "0")
    public Long operationRun_DPL_rootId;

    @OraName(value = "D_BRANCHNO")
    @InitOrder(value = "5")
    @DataType(value = TransformType.LONG)
    public Long deporezerv_branchno;

    @OraName(value = "D_CLERK")
    @InitOrder(value = "6")
    @DataType(value = TransformType.LONG)
    public Long deporezervClerk;

    @OraName(value = "D_DAYFACT")
    @InitOrder(value = "7")
    @DataType(value = TransformType.DATE_TIME)
    public Date deporezervDayfact;

    @OraName(value = "D_DAYREZERV")
    @InitOrder(value = "8")
    @DataType(value = TransformType.DATE_TIME)
    public Date deporezervDayrezerv;

    @OraName(value = "D_ID_MEGA")
    @InitOrder(value = "9")
    @DataType(value = TransformType.LONG)
    public Long deporezerv_tb;

    @OraName(value = "D_INITIATOR")
    @InitOrder(value = "10")
    @DataType(value = TransformType.STRING)
    public String deporezervInitiator;

    @OraName(value = "D_JRNNO")
    @InitOrder(value = "11")
    @DataType(value = TransformType.LONG)
    public Long deporezervJrnno;

    @OraName(value = "D_OFFICE")
    @InitOrder(value = "12")
    @DataType(value = TransformType.LONG)
    public Long deporezerv_office;

    @OraName(value = "D_OPCASHREZERV")
    @InitOrder(value = "13")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal deporezervOpcashrezerv;

    @OraName(value = "D_REZERVID")
    @InitOrder(value = "14")
    @DataType(value = TransformType.LONG)
    public Long deporezervRezervid;

    @OraName(value = "D_STATE")
    @InitOrder(value = "15")
    @DataType(value = TransformType.LONG)
    public Long deporezervState;

    @OraName(value = "category")
    @InitOrder(value = "16")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

    @OraName(value = "partitionid")
    @InitOrder(value = "17")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;

    @OraName(value = "code")
    @DataType(value = TransformType.STRING)
    public String code;

    @OraName(value = "name")
    @DataType(value = TransformType.STRING)
    public String name;

    @OraName(value = "sourceid")
    @DataType(value = TransformType.STRING)
    public String sourceId;

    @OraName(value = "sourcesystemid")
    @DataType(value = TransformType.STRING)
    public String sourceSystemId;

    public Long templObjId;

    public Long parentObjId;

    @OraName(value = "id")
    @InitOrder(value = "1")
    @DataType(value = TransformType.LONG)
    public Long objectId;


    public boolean isDeleted=false;
	public Long lastChangeDate = System.currentTimeMillis();

}
