
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.model.extension.deposit.DepoHist;

 import ru.sbt.kmdtransform.TransformType.*;

 public class DepoHistBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         DepoHist r = new DepoHist();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.operationRun_DPL_id = DelimetedStringParser._long(3, line, indexes);
r.cardhistAtmid = DelimetedStringParser.str(4, line, indexes);
r.cardhistAuthcode = DelimetedStringParser.str(5, line, indexes);
r.cardhistAuthkind = DelimetedStringParser._int(6, line, indexes);
r.cardhistCardno = DelimetedStringParser.str(7, line, indexes);
r.cardhistMerchantno = DelimetedStringParser.str(8, line, indexes);
r.cardhistTxcash = DelimetedStringParser.bigDecimal(9, line, indexes);
r.cardhistTxcurrency = DelimetedStringParser._int(10, line, indexes);
r.cardhistTxid = DelimetedStringParser._int(11, line, indexes);
r.cardhistTxtime = DelimetedStringParser.date(12, line, indexes);
r.depohistAssignday = DelimetedStringParser.date(13, line, indexes);
r.depohistAssminbalance = DelimetedStringParser.bigDecimal(14, line, indexes);
r.depohistBalance = DelimetedStringParser.bigDecimal(15, line, indexes);
r.depohistBalanceOwn = DelimetedStringParser.bigDecimal(16, line, indexes);
r.depohistSubsidy = DelimetedStringParser.bigDecimal(17, line, indexes);
r.depohist_branchno = DelimetedStringParser._int(18, line, indexes);
r.depohistCardrptday = DelimetedStringParser.date(19, line, indexes);
r.depohistCashsource = DelimetedStringParser._int(20, line, indexes);
r.depohistChequecnt = DelimetedStringParser._int(21, line, indexes);
r.depohistClerk = DelimetedStringParser._int(22, line, indexes);
r.depohistConverCurrency = DelimetedStringParser._int(23, line, indexes);
r.depohistConverOpcash = DelimetedStringParser.bigDecimal(24, line, indexes);
r.depohistCreditaccount = DelimetedStringParser.str(25, line, indexes);
r.depohistDebitaccount = DelimetedStringParser.str(26, line, indexes);
r.depohistDepositrate = DelimetedStringParser.bigDecimal(27, line, indexes);
r.depohistExpirationday = DelimetedStringParser.date(28, line, indexes);
r.depohistExpminbalance = DelimetedStringParser.bigDecimal(29, line, indexes);
r.depohistExproverdraft = DelimetedStringParser.bigDecimal(30, line, indexes);
r.depohistExproverdraftint = DelimetedStringParser.bigDecimal(31, line, indexes);
r.depohistExternalkind = DelimetedStringParser._int(32, line, indexes);
r.depohistFlagCash = DelimetedStringParser._int(33, line, indexes);
r.depohistGrantOper = DelimetedStringParser._int(34, line, indexes);
r.depohistHeirno = DelimetedStringParser._int(35, line, indexes);
r.depohist_tb = DelimetedStringParser._int(36, line, indexes);
r.depohistInserttime = DelimetedStringParser.date(37, line, indexes);
r.depohistInterest = DelimetedStringParser.bigDecimal(38, line, indexes);
r.depohistInterestf = DelimetedStringParser.bigDecimal(39, line, indexes);
r.depohistIscashdispenser = DelimetedStringParser._int(40, line, indexes);
r.depohistIsmanual = DelimetedStringParser._int(41, line, indexes);
r.depohistIsmoffice = DelimetedStringParser._int(42, line, indexes);
r.depohistJrnno = DelimetedStringParser._int(43, line, indexes);
r.depohistMaxamount = DelimetedStringParser.bigDecimal(44, line, indexes);
r.depohistMaxamountrate = DelimetedStringParser.bigDecimal(45, line, indexes);
r.depohistNDprice = DelimetedStringParser._long(46, line, indexes);
r.depohistOffcashbalanceb = DelimetedStringParser.bigDecimal(48, line, indexes);
r.depohistOffice = DelimetedStringParser._int(49, line, indexes);
r.depohistOfficetransday = DelimetedStringParser.date(50, line, indexes);
r.depohistOpcash = DelimetedStringParser.bigDecimal(51, line, indexes);
r.depohistOpcashcost = DelimetedStringParser.bigDecimal(52, line, indexes);
r.depohistOpcode = DelimetedStringParser._int(53, line, indexes);
r.depohistOpday = DelimetedStringParser.date(54, line, indexes);
r.depohistOpencash = DelimetedStringParser.bigDecimal(55, line, indexes);
r.depohistOpkind = DelimetedStringParser._int(56, line, indexes);
r.depohistOpno = DelimetedStringParser._int(57, line, indexes);
r.depohistOptransday = DelimetedStringParser.date(58, line, indexes);
r.depohistOrderno = DelimetedStringParser.str(59, line, indexes);
r.depohistMinBalanceMonth = DelimetedStringParser.bigDecimal(60, line, indexes);
r.depohistBalanceOwnProlong = DelimetedStringParser.bigDecimal(61, line, indexes);
r.depohistOverdraft = DelimetedStringParser.bigDecimal(62, line, indexes);
r.depohistOverdraftint = DelimetedStringParser.bigDecimal(63, line, indexes);
r.depohistPairAccount = DelimetedStringParser.str(64, line, indexes);
r.depohistPartrate = DelimetedStringParser.bigDecimal(65, line, indexes);
r.depohistPayrollday = DelimetedStringParser.date(66, line, indexes);
r.depohistPayAddFirst = DelimetedStringParser.date(67, line, indexes);
r.depohistPercentsrate = DelimetedStringParser.bigDecimal(68, line, indexes);
r.depohistPinacceptflag = DelimetedStringParser._int(69, line, indexes);
r.depohistProlongday = DelimetedStringParser.date(70, line, indexes);
r.depohistRatesource = DelimetedStringParser._int(71, line, indexes);
r.depohistReason = DelimetedStringParser._int(72, line, indexes);
r.depohistSbookendday = DelimetedStringParser.date(73, line, indexes);
r.depohistSourcedocday = DelimetedStringParser.date(74, line, indexes);
r.depohistSourcedocno = DelimetedStringParser.str(75, line, indexes);
r.depohistSourcedocoriginator = DelimetedStringParser.str(76, line, indexes);
r.depohistState = DelimetedStringParser._int(77, line, indexes);
r.depohistSubsys = DelimetedStringParser._int(78, line, indexes);
r.depohistSumobnaloperation = DelimetedStringParser.bigDecimal(79, line, indexes);
r.depohistTaxableprofit = DelimetedStringParser.bigDecimal(80, line, indexes);
r.depohistTaxableprofitcost = DelimetedStringParser.bigDecimal(81, line, indexes);
r.depohistTermsok = DelimetedStringParser._int(82, line, indexes);
r.depohistTurncode = DelimetedStringParser._int(83, line, indexes);
r.depohistUsedtaxexemptions = DelimetedStringParser.bigDecimal(84, line, indexes);
r.depohistVHzap2 = DelimetedStringParser._int(85, line, indexes);
r.depohistWarrantkind = DelimetedStringParser._int(86, line, indexes);
r.depohistWarrantno = DelimetedStringParser.str(87, line, indexes);
r.offcashcompInfo = DelimetedStringParser.str(88, line, indexes);
r.offcashcompOpday = DelimetedStringParser.date(89, line, indexes);
r.offcashcompOpno = DelimetedStringParser._int(90, line, indexes);
r.offcashcompOrdno = DelimetedStringParser.str(91, line, indexes);
r.offcashcompSsagency = DelimetedStringParser.str(92, line, indexes);
r.offcashcompSsn = DelimetedStringParser.str(93, line, indexes);
r.offcashcompVDnum1 = DelimetedStringParser._int(94, line, indexes);
r.offcashcompVDsum1 = DelimetedStringParser.bigDecimal(95, line, indexes);
r.offcashcompVDsum2 = DelimetedStringParser.bigDecimal(96, line, indexes);
r.offcashcompVDsum3 = DelimetedStringParser.bigDecimal(97, line, indexes);
r.offcashcompVDsum4 = DelimetedStringParser.bigDecimal(98, line, indexes);
r.offcashcompVDsum5 = DelimetedStringParser.bigDecimal(99, line, indexes);
r.offcashcompVDsum6 = DelimetedStringParser.bigDecimal(100, line, indexes);
r.offcashcompVDsum7 = DelimetedStringParser.bigDecimal(101, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(102, line, indexes);
r.depohistrgCpBalance = DelimetedStringParser.bigDecimal(103, line, indexes);
r.depohistrgCpOpcash = DelimetedStringParser.bigDecimal(104, line, indexes);
r.depohistrgSprBalance = DelimetedStringParser.bigDecimal(105, line, indexes);
r.depohistrgSprOpcash = DelimetedStringParser.bigDecimal(106, line, indexes);
r.depohistrgCn1Balance = DelimetedStringParser.bigDecimal(107, line, indexes);
r.depohistrgCn1Opcash = DelimetedStringParser.bigDecimal(108, line, indexes);
r.depohistrgCn2Balance = DelimetedStringParser.bigDecimal(109, line, indexes);
r.depohistrgCn2Opcash = DelimetedStringParser.bigDecimal(110, line, indexes);
r.enrollType = DelimetedStringParser._int(111, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(112, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         DepoHist f = (DepoHist)first;
         DepoHist s = (DepoHist)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.operationRun_DPL_id, s.operationRun_DPL_id) != 0) return CompareUtils.compare(f.operationRun_DPL_id, s.operationRun_DPL_id);
if (CompareUtils.compare(f.cardhistAtmid, s.cardhistAtmid) != 0) return CompareUtils.compare(f.cardhistAtmid, s.cardhistAtmid);
if (CompareUtils.compare(f.cardhistAuthcode, s.cardhistAuthcode) != 0) return CompareUtils.compare(f.cardhistAuthcode, s.cardhistAuthcode);
if (CompareUtils.compare(f.cardhistAuthkind, s.cardhistAuthkind) != 0) return CompareUtils.compare(f.cardhistAuthkind, s.cardhistAuthkind);
if (CompareUtils.compare(f.cardhistCardno, s.cardhistCardno) != 0) return CompareUtils.compare(f.cardhistCardno, s.cardhistCardno);
if (CompareUtils.compare(f.cardhistMerchantno, s.cardhistMerchantno) != 0) return CompareUtils.compare(f.cardhistMerchantno, s.cardhistMerchantno);
if (CompareUtils.compare(f.cardhistTxcash, s.cardhistTxcash) != 0) return CompareUtils.compare(f.cardhistTxcash, s.cardhistTxcash);
if (CompareUtils.compare(f.cardhistTxcurrency, s.cardhistTxcurrency) != 0) return CompareUtils.compare(f.cardhistTxcurrency, s.cardhistTxcurrency);
if (CompareUtils.compare(f.cardhistTxid, s.cardhistTxid) != 0) return CompareUtils.compare(f.cardhistTxid, s.cardhistTxid);
if (CompareUtils.compare(f.cardhistTxtime, s.cardhistTxtime) != 0) return CompareUtils.compare(f.cardhistTxtime, s.cardhistTxtime);
if (CompareUtils.compare(f.depohistAssignday, s.depohistAssignday) != 0) return CompareUtils.compare(f.depohistAssignday, s.depohistAssignday);
if (CompareUtils.compare(f.depohistAssminbalance, s.depohistAssminbalance) != 0) return CompareUtils.compare(f.depohistAssminbalance, s.depohistAssminbalance);
if (CompareUtils.compare(f.depohistBalance, s.depohistBalance) != 0) return CompareUtils.compare(f.depohistBalance, s.depohistBalance);
if (CompareUtils.compare(f.depohistBalanceOwn, s.depohistBalanceOwn) != 0) return CompareUtils.compare(f.depohistBalanceOwn, s.depohistBalanceOwn);
if (CompareUtils.compare(f.depohistSubsidy, s.depohistSubsidy) != 0) return CompareUtils.compare(f.depohistSubsidy, s.depohistSubsidy);
if (CompareUtils.compare(f.depohist_branchno, s.depohist_branchno) != 0) return CompareUtils.compare(f.depohist_branchno, s.depohist_branchno);
if (CompareUtils.compare(f.depohistCardrptday, s.depohistCardrptday) != 0) return CompareUtils.compare(f.depohistCardrptday, s.depohistCardrptday);
if (CompareUtils.compare(f.depohistCashsource, s.depohistCashsource) != 0) return CompareUtils.compare(f.depohistCashsource, s.depohistCashsource);
if (CompareUtils.compare(f.depohistChequecnt, s.depohistChequecnt) != 0) return CompareUtils.compare(f.depohistChequecnt, s.depohistChequecnt);
if (CompareUtils.compare(f.depohistClerk, s.depohistClerk) != 0) return CompareUtils.compare(f.depohistClerk, s.depohistClerk);
if (CompareUtils.compare(f.depohistConverCurrency, s.depohistConverCurrency) != 0) return CompareUtils.compare(f.depohistConverCurrency, s.depohistConverCurrency);
if (CompareUtils.compare(f.depohistConverOpcash, s.depohistConverOpcash) != 0) return CompareUtils.compare(f.depohistConverOpcash, s.depohistConverOpcash);
if (CompareUtils.compare(f.depohistCreditaccount, s.depohistCreditaccount) != 0) return CompareUtils.compare(f.depohistCreditaccount, s.depohistCreditaccount);
if (CompareUtils.compare(f.depohistDebitaccount, s.depohistDebitaccount) != 0) return CompareUtils.compare(f.depohistDebitaccount, s.depohistDebitaccount);
if (CompareUtils.compare(f.depohistDepositrate, s.depohistDepositrate) != 0) return CompareUtils.compare(f.depohistDepositrate, s.depohistDepositrate);
if (CompareUtils.compare(f.depohistExpirationday, s.depohistExpirationday) != 0) return CompareUtils.compare(f.depohistExpirationday, s.depohistExpirationday);
if (CompareUtils.compare(f.depohistExpminbalance, s.depohistExpminbalance) != 0) return CompareUtils.compare(f.depohistExpminbalance, s.depohistExpminbalance);
if (CompareUtils.compare(f.depohistExproverdraft, s.depohistExproverdraft) != 0) return CompareUtils.compare(f.depohistExproverdraft, s.depohistExproverdraft);
if (CompareUtils.compare(f.depohistExproverdraftint, s.depohistExproverdraftint) != 0) return CompareUtils.compare(f.depohistExproverdraftint, s.depohistExproverdraftint);
if (CompareUtils.compare(f.depohistExternalkind, s.depohistExternalkind) != 0) return CompareUtils.compare(f.depohistExternalkind, s.depohistExternalkind);
if (CompareUtils.compare(f.depohistFlagCash, s.depohistFlagCash) != 0) return CompareUtils.compare(f.depohistFlagCash, s.depohistFlagCash);
if (CompareUtils.compare(f.depohistGrantOper, s.depohistGrantOper) != 0) return CompareUtils.compare(f.depohistGrantOper, s.depohistGrantOper);
if (CompareUtils.compare(f.depohistHeirno, s.depohistHeirno) != 0) return CompareUtils.compare(f.depohistHeirno, s.depohistHeirno);
if (CompareUtils.compare(f.depohist_tb, s.depohist_tb) != 0) return CompareUtils.compare(f.depohist_tb, s.depohist_tb);
if (CompareUtils.compare(f.depohistInserttime, s.depohistInserttime) != 0) return CompareUtils.compare(f.depohistInserttime, s.depohistInserttime);
if (CompareUtils.compare(f.depohistInterest, s.depohistInterest) != 0) return CompareUtils.compare(f.depohistInterest, s.depohistInterest);
if (CompareUtils.compare(f.depohistInterestf, s.depohistInterestf) != 0) return CompareUtils.compare(f.depohistInterestf, s.depohistInterestf);
if (CompareUtils.compare(f.depohistIscashdispenser, s.depohistIscashdispenser) != 0) return CompareUtils.compare(f.depohistIscashdispenser, s.depohistIscashdispenser);
if (CompareUtils.compare(f.depohistIsmanual, s.depohistIsmanual) != 0) return CompareUtils.compare(f.depohistIsmanual, s.depohistIsmanual);
if (CompareUtils.compare(f.depohistIsmoffice, s.depohistIsmoffice) != 0) return CompareUtils.compare(f.depohistIsmoffice, s.depohistIsmoffice);
if (CompareUtils.compare(f.depohistJrnno, s.depohistJrnno) != 0) return CompareUtils.compare(f.depohistJrnno, s.depohistJrnno);
if (CompareUtils.compare(f.depohistMaxamount, s.depohistMaxamount) != 0) return CompareUtils.compare(f.depohistMaxamount, s.depohistMaxamount);
if (CompareUtils.compare(f.depohistMaxamountrate, s.depohistMaxamountrate) != 0) return CompareUtils.compare(f.depohistMaxamountrate, s.depohistMaxamountrate);
if (CompareUtils.compare(f.depohistNDprice, s.depohistNDprice) != 0) return CompareUtils.compare(f.depohistNDprice, s.depohistNDprice);
if (CompareUtils.compare(f.depohistOffcashbalanceb, s.depohistOffcashbalanceb) != 0) return CompareUtils.compare(f.depohistOffcashbalanceb, s.depohistOffcashbalanceb);
if (CompareUtils.compare(f.depohistOffice, s.depohistOffice) != 0) return CompareUtils.compare(f.depohistOffice, s.depohistOffice);
if (CompareUtils.compare(f.depohistOfficetransday, s.depohistOfficetransday) != 0) return CompareUtils.compare(f.depohistOfficetransday, s.depohistOfficetransday);
if (CompareUtils.compare(f.depohistOpcash, s.depohistOpcash) != 0) return CompareUtils.compare(f.depohistOpcash, s.depohistOpcash);
if (CompareUtils.compare(f.depohistOpcashcost, s.depohistOpcashcost) != 0) return CompareUtils.compare(f.depohistOpcashcost, s.depohistOpcashcost);
if (CompareUtils.compare(f.depohistOpcode, s.depohistOpcode) != 0) return CompareUtils.compare(f.depohistOpcode, s.depohistOpcode);
if (CompareUtils.compare(f.depohistOpday, s.depohistOpday) != 0) return CompareUtils.compare(f.depohistOpday, s.depohistOpday);
if (CompareUtils.compare(f.depohistOpencash, s.depohistOpencash) != 0) return CompareUtils.compare(f.depohistOpencash, s.depohistOpencash);
if (CompareUtils.compare(f.depohistOpkind, s.depohistOpkind) != 0) return CompareUtils.compare(f.depohistOpkind, s.depohistOpkind);
if (CompareUtils.compare(f.depohistOpno, s.depohistOpno) != 0) return CompareUtils.compare(f.depohistOpno, s.depohistOpno);
if (CompareUtils.compare(f.depohistOptransday, s.depohistOptransday) != 0) return CompareUtils.compare(f.depohistOptransday, s.depohistOptransday);
if (CompareUtils.compare(f.depohistOrderno, s.depohistOrderno) != 0) return CompareUtils.compare(f.depohistOrderno, s.depohistOrderno);
if (CompareUtils.compare(f.depohistMinBalanceMonth, s.depohistMinBalanceMonth) != 0) return CompareUtils.compare(f.depohistMinBalanceMonth, s.depohistMinBalanceMonth);
if (CompareUtils.compare(f.depohistBalanceOwnProlong, s.depohistBalanceOwnProlong) != 0) return CompareUtils.compare(f.depohistBalanceOwnProlong, s.depohistBalanceOwnProlong);
if (CompareUtils.compare(f.depohistOverdraft, s.depohistOverdraft) != 0) return CompareUtils.compare(f.depohistOverdraft, s.depohistOverdraft);
if (CompareUtils.compare(f.depohistOverdraftint, s.depohistOverdraftint) != 0) return CompareUtils.compare(f.depohistOverdraftint, s.depohistOverdraftint);
if (CompareUtils.compare(f.depohistPairAccount, s.depohistPairAccount) != 0) return CompareUtils.compare(f.depohistPairAccount, s.depohistPairAccount);
if (CompareUtils.compare(f.depohistPartrate, s.depohistPartrate) != 0) return CompareUtils.compare(f.depohistPartrate, s.depohistPartrate);
if (CompareUtils.compare(f.depohistPayrollday, s.depohistPayrollday) != 0) return CompareUtils.compare(f.depohistPayrollday, s.depohistPayrollday);
if (CompareUtils.compare(f.depohistPayAddFirst, s.depohistPayAddFirst) != 0) return CompareUtils.compare(f.depohistPayAddFirst, s.depohistPayAddFirst);
if (CompareUtils.compare(f.depohistPercentsrate, s.depohistPercentsrate) != 0) return CompareUtils.compare(f.depohistPercentsrate, s.depohistPercentsrate);
if (CompareUtils.compare(f.depohistPinacceptflag, s.depohistPinacceptflag) != 0) return CompareUtils.compare(f.depohistPinacceptflag, s.depohistPinacceptflag);
if (CompareUtils.compare(f.depohistProlongday, s.depohistProlongday) != 0) return CompareUtils.compare(f.depohistProlongday, s.depohistProlongday);
if (CompareUtils.compare(f.depohistRatesource, s.depohistRatesource) != 0) return CompareUtils.compare(f.depohistRatesource, s.depohistRatesource);
if (CompareUtils.compare(f.depohistReason, s.depohistReason) != 0) return CompareUtils.compare(f.depohistReason, s.depohistReason);
if (CompareUtils.compare(f.depohistSbookendday, s.depohistSbookendday) != 0) return CompareUtils.compare(f.depohistSbookendday, s.depohistSbookendday);
if (CompareUtils.compare(f.depohistSourcedocday, s.depohistSourcedocday) != 0) return CompareUtils.compare(f.depohistSourcedocday, s.depohistSourcedocday);
if (CompareUtils.compare(f.depohistSourcedocno, s.depohistSourcedocno) != 0) return CompareUtils.compare(f.depohistSourcedocno, s.depohistSourcedocno);
if (CompareUtils.compare(f.depohistSourcedocoriginator, s.depohistSourcedocoriginator) != 0) return CompareUtils.compare(f.depohistSourcedocoriginator, s.depohistSourcedocoriginator);
if (CompareUtils.compare(f.depohistState, s.depohistState) != 0) return CompareUtils.compare(f.depohistState, s.depohistState);
if (CompareUtils.compare(f.depohistSubsys, s.depohistSubsys) != 0) return CompareUtils.compare(f.depohistSubsys, s.depohistSubsys);
if (CompareUtils.compare(f.depohistSumobnaloperation, s.depohistSumobnaloperation) != 0) return CompareUtils.compare(f.depohistSumobnaloperation, s.depohistSumobnaloperation);
if (CompareUtils.compare(f.depohistTaxableprofit, s.depohistTaxableprofit) != 0) return CompareUtils.compare(f.depohistTaxableprofit, s.depohistTaxableprofit);
if (CompareUtils.compare(f.depohistTaxableprofitcost, s.depohistTaxableprofitcost) != 0) return CompareUtils.compare(f.depohistTaxableprofitcost, s.depohistTaxableprofitcost);
if (CompareUtils.compare(f.depohistTermsok, s.depohistTermsok) != 0) return CompareUtils.compare(f.depohistTermsok, s.depohistTermsok);
if (CompareUtils.compare(f.depohistTurncode, s.depohistTurncode) != 0) return CompareUtils.compare(f.depohistTurncode, s.depohistTurncode);
if (CompareUtils.compare(f.depohistUsedtaxexemptions, s.depohistUsedtaxexemptions) != 0) return CompareUtils.compare(f.depohistUsedtaxexemptions, s.depohistUsedtaxexemptions);
if (CompareUtils.compare(f.depohistVHzap2, s.depohistVHzap2) != 0) return CompareUtils.compare(f.depohistVHzap2, s.depohistVHzap2);
if (CompareUtils.compare(f.depohistWarrantkind, s.depohistWarrantkind) != 0) return CompareUtils.compare(f.depohistWarrantkind, s.depohistWarrantkind);
if (CompareUtils.compare(f.depohistWarrantno, s.depohistWarrantno) != 0) return CompareUtils.compare(f.depohistWarrantno, s.depohistWarrantno);
if (CompareUtils.compare(f.offcashcompInfo, s.offcashcompInfo) != 0) return CompareUtils.compare(f.offcashcompInfo, s.offcashcompInfo);
if (CompareUtils.compare(f.offcashcompOpday, s.offcashcompOpday) != 0) return CompareUtils.compare(f.offcashcompOpday, s.offcashcompOpday);
if (CompareUtils.compare(f.offcashcompOpno, s.offcashcompOpno) != 0) return CompareUtils.compare(f.offcashcompOpno, s.offcashcompOpno);
if (CompareUtils.compare(f.offcashcompOrdno, s.offcashcompOrdno) != 0) return CompareUtils.compare(f.offcashcompOrdno, s.offcashcompOrdno);
if (CompareUtils.compare(f.offcashcompSsagency, s.offcashcompSsagency) != 0) return CompareUtils.compare(f.offcashcompSsagency, s.offcashcompSsagency);
if (CompareUtils.compare(f.offcashcompSsn, s.offcashcompSsn) != 0) return CompareUtils.compare(f.offcashcompSsn, s.offcashcompSsn);
if (CompareUtils.compare(f.offcashcompVDnum1, s.offcashcompVDnum1) != 0) return CompareUtils.compare(f.offcashcompVDnum1, s.offcashcompVDnum1);
if (CompareUtils.compare(f.offcashcompVDsum1, s.offcashcompVDsum1) != 0) return CompareUtils.compare(f.offcashcompVDsum1, s.offcashcompVDsum1);
if (CompareUtils.compare(f.offcashcompVDsum2, s.offcashcompVDsum2) != 0) return CompareUtils.compare(f.offcashcompVDsum2, s.offcashcompVDsum2);
if (CompareUtils.compare(f.offcashcompVDsum3, s.offcashcompVDsum3) != 0) return CompareUtils.compare(f.offcashcompVDsum3, s.offcashcompVDsum3);
if (CompareUtils.compare(f.offcashcompVDsum4, s.offcashcompVDsum4) != 0) return CompareUtils.compare(f.offcashcompVDsum4, s.offcashcompVDsum4);
if (CompareUtils.compare(f.offcashcompVDsum5, s.offcashcompVDsum5) != 0) return CompareUtils.compare(f.offcashcompVDsum5, s.offcashcompVDsum5);
if (CompareUtils.compare(f.offcashcompVDsum6, s.offcashcompVDsum6) != 0) return CompareUtils.compare(f.offcashcompVDsum6, s.offcashcompVDsum6);
if (CompareUtils.compare(f.offcashcompVDsum7, s.offcashcompVDsum7) != 0) return CompareUtils.compare(f.offcashcompVDsum7, s.offcashcompVDsum7);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.depohistrgCpBalance, s.depohistrgCpBalance) != 0) return CompareUtils.compare(f.depohistrgCpBalance, s.depohistrgCpBalance);
if (CompareUtils.compare(f.depohistrgCpOpcash, s.depohistrgCpOpcash) != 0) return CompareUtils.compare(f.depohistrgCpOpcash, s.depohistrgCpOpcash);
if (CompareUtils.compare(f.depohistrgSprBalance, s.depohistrgSprBalance) != 0) return CompareUtils.compare(f.depohistrgSprBalance, s.depohistrgSprBalance);
if (CompareUtils.compare(f.depohistrgSprOpcash, s.depohistrgSprOpcash) != 0) return CompareUtils.compare(f.depohistrgSprOpcash, s.depohistrgSprOpcash);
if (CompareUtils.compare(f.depohistrgCn1Balance, s.depohistrgCn1Balance) != 0) return CompareUtils.compare(f.depohistrgCn1Balance, s.depohistrgCn1Balance);
if (CompareUtils.compare(f.depohistrgCn1Opcash, s.depohistrgCn1Opcash) != 0) return CompareUtils.compare(f.depohistrgCn1Opcash, s.depohistrgCn1Opcash);
if (CompareUtils.compare(f.depohistrgCn2Balance, s.depohistrgCn2Balance) != 0) return CompareUtils.compare(f.depohistrgCn2Balance, s.depohistrgCn2Balance);
if (CompareUtils.compare(f.depohistrgCn2Opcash, s.depohistrgCn2Opcash) != 0) return CompareUtils.compare(f.depohistrgCn2Opcash, s.depohistrgCn2Opcash);
if (CompareUtils.compare(f.enrollType, s.enrollType) != 0) return CompareUtils.compare(f.enrollType, s.enrollType);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            