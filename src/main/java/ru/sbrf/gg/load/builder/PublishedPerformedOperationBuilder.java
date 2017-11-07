
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedPerformedOperationBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.api.model.published.instance.PublishedPerformedOperation r = new com.sbt.cdm.api.model.published.instance.PublishedPerformedOperation();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.type_DPL_id = DelimetedStringParser._long(5, line, indexes);
r.code = DelimetedStringParser.str(6, line, indexes);
r.name = DelimetedStringParser.str(7, line, indexes);
r.status_DPL_id = DelimetedStringParser._long(8, line, indexes);
r.states_DPL_collectField = DelimetedStringParser.strBuilder(9, line, indexes);
r.service_DPL_id = DelimetedStringParser._long(10, line, indexes);
r.client_DPL_id = DelimetedStringParser._long(11, line, indexes);
r.product_DPL_id = DelimetedStringParser._long(12, line, indexes);
r.contract_DPL_id = DelimetedStringParser._long(13, line, indexes);
r.register_DPL_id = DelimetedStringParser._long(14, line, indexes);
r.beginDate = DelimetedStringParser.date(15, line, indexes);
r.endDate = DelimetedStringParser.date(16, line, indexes);
r.division_DPL_id = DelimetedStringParser._long(17, line, indexes);
r.parameters_DPL_collectField = DelimetedStringParser.strBuilder(18, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(19, line, indexes);
r.registerRec_DPL_collectField = DelimetedStringParser.strBuilder(20, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(21, line, indexes);

         return r;
     }
 }
            
