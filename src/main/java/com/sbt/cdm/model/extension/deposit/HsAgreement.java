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
public class HsAgreement {

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

    @OraName(value = "documentid")
    @InitOrder(value = "4")
    @DataType(value = TransformType.LONG)
    public Long docInst_DPL_id;

    @DataType(value = TransformType.PARTITION)
    @PartForField(value = "docInst_DPL_id")
    @Default(value = "0")
    public Long docInst_DPL_colocationKey;

    @DataType(value = TransformType.ROOT)
    @PartForField(value = "docInst_DPL_id")
    @Default(value = "0")
    public Long docInst_DPL_rootId;

    @OraName(value = "H_AGREEMENT_SUM")
    @InitOrder(value = "5")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal agreementSum;

    @OraName(value = "H_AREA")
    @InitOrder(value = "6")
    @DataType(value = TransformType.BIGDECIMAL)
    public BigDecimal area;

    @OraName(value = "H_CERTIFICATE_BY")
    @InitOrder(value = "7")
    @DataType(value = TransformType.STRING)
    public String certificateBy;

    @OraName(value = "H_CERTIFICATE_DATE")
    @InitOrder(value = "8")
    @DataType(value = TransformType.DATE_TIME)
    public Date certificateDate;

    @OraName(value = "H_CERTIFICATE_NO")
    @InitOrder(value = "9")
    @DataType(value = TransformType.STRING)
    public String certificateNo;

    @OraName(value = "H_TOWN")
    @InitOrder(value = "10")
    @DataType(value = TransformType.STRING)
    public String town;

//    @OraName(value = "Deposit")
//    @InitOrder(value = "11")
//    @DataType(value = TransformType.LONG)
//    public Long productParty_DPL_id;
//
//    @DataType(value = TransformType.PARTITION)
//    @PartForField(value = "productParty_DPL_id")
//    @Default(value = "0")
//    public Long productParty_DPL_colocationKey;
//
//    @DataType(value = TransformType.ROOT)
//    @PartForField(value = "productParty_DPL_id")
//    @Default(value = "0")
//    public Long productParty_DPL_rootId;

    @OraName(value = "category")
    @InitOrder(value = "12")
    @Default(value = "0")
    @DictName(value="category")
    @DataType(value = TransformType.LONG)
    public Long category_DPL_id;

    @OraName(value = "partitionid")
    @InitOrder(value = "13")
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
