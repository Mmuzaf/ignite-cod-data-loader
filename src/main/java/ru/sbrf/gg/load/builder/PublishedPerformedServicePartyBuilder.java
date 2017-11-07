
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedPerformedServicePartyBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.api.model.published.instance.PublishedPerformedServiceParty r = new com.sbt.cdm.api.model.published.instance.PublishedPerformedServiceParty();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.service_DPL_id = DelimetedStringParser._long(4, line, indexes);
r.code = DelimetedStringParser.str(5, line, indexes);
r.name = DelimetedStringParser.str(6, line, indexes);
r.party_DPL_id = DelimetedStringParser._long(7, line, indexes);
r.parameters_DPL_collectField = DelimetedStringParser.strBuilder(8, line, indexes);
r.productPartyRoleType_DPL_id = DelimetedStringParser._long(9, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(10, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(11, line, indexes);

         return r;
     }
 }
            
