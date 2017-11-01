/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbt.cdm.api.model.published.instance;

import ru.sbt.kmdtransform.*;

/**
 *
 * @author sbt-kuchevasov-vi
 */
public class PublishedProductPartyRoleInst {
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
////    @InitOrder(value = "3")
//    @DataType(value = TransformType.LONG)
//    public Long templateId;

//    @OraName(value = "parentId")
//    @InitOrder(value = "4")
//    @DataType(value = TransformType.LONG)
//    public Long parentId;

    @OraName(value = "product")
    @InitOrder(value = "5")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long product_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "product_DPL_id")
    public Long product_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "product_DPL_id")
    public Long product_DPL_rootId;

    @OraName(value = "code")
    @InitOrder(value = "6")
    @DataType(value = TransformType.STRING)
    public String code;

    @OraName(value = "name")
    @InitOrder(value = "7")
    @DataType(value = TransformType.STRING)
    public String name;

    @OraName(value = "owner")
    @InitOrder(value = "8")
    @ClientField(value = "true")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    public Long party_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "party_DPL_id")
    public Long party_DPL_colocationKey;

    @OraName(value = "parameters")
    @InitOrder(value = "9")
    @DataType(value = TransformType.CSL_AFFINITYPARTICLES)
    public StringBuilder parameters_DPL_collectField;

    @OraName(value = "productPartyRoleType")
    @InitOrder(value = "10")
    @DataType(value = TransformType.LONG)
    @Default(value = "0")
    @DictName(value="type")
    public Long productPartyRoleType_DPL_id;

    public StringBuilder permissionObjects_DPL_collectField;

    @OraName(value = "category")
    @InitOrder(value = "11")
    @Default(value = "0")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

    @OraName(value = "partitionid")
    @InitOrder(value = "12")
    @DataType(value = TransformType.LONG)
    public Long partition_DPL_id;



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
