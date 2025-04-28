package cn.initialfire.tushare.api.stock.responsedata;

import lombok.Data;

@Data
public class StockCashflowReport {

    /*
     * 股票代码
     */
    private String tsCode;

    /*
     * 公告日期
     */
    private String annDate;

    /*
     * 实际公告日期
     */
    private String fAnnDate;

    /*
     * 报告期
     */
    private String endDate;
    
    /*
     * 公司类型
     */
    private String compType;

    /*
     * 报表类型
     */
    private String reportType;

    /*
     * 报告类型
     */
    private String endType;

    /*
     * 更新标志(1最新)
     */
    private String updateFlag;

    /*
     * 期初现金及现金等价物余额
     */
    private Double cCashEquBegPeriod;

    /*
     * 期末现金及现金等价物余额
     */
    private Double cCashEquEndPeriod;

    /*
     * 现金的期末余额
     */
    private Double endBalCash;

    /*
     * 减:现金的期初余额
     */
    private Double begBalCash;

    /*
     * 加:现金等价物的期末余额
     */
    private Double endBalCashEqu;

    /*
     * 减:现金等价物的期初余额
     */
    private Double begBalCashEqu;

    /*
     * 现金及现金等价物净增加额
     */
    private Double nIncrCashCashEqu;

    /*
     * 现金及现金等价物净增加额(间接法)
     */
    private Double imNIncrCashEqu;

    /*
     * 净利润
     */
    private Double netProfit;

    /*
     * 财务费用
     */
    private Double finanExp;

    /*
     * 销售商品、提供劳务收到的现金
     */
    private Double cFrSaleSg;

    /*
     * 收到的税费返还
     */
    private Double recpTaxRends;

    /*
     * 客户存款和同业存放款项净增加额
     */
    private Double nDeposIncrFi;

    /*
     * 向中央银行借款净增加额
     */
    private Double nIncrLoansCb;

    /*
     * 向其他金融机构拆入资金净增加额
     */
    private Double nIncBorrOthFi;

    /*
     * 收到原保险合同保费取得的现金
     */
    private Double premFrOrigContr;

    /*
     * 保户储金净增加额
     */
    private Double nIncrInsuredDep;

    /*
     * 收到再保业务现金净额
     */
    private Double nReinsurPrem;

    /*
     * 处置交易性金融资产净增加额
     */
    private Double nIncrDispTfa;

    /*
     * 收取利息和手续费净增加额
     */
    private Double ifcCashIncr;

    /*
     * 处置可供出售金融资产净增加额
     */
    private Double nIncrDispFaas;

    /*
     * 拆入资金净增加额
     */
    private Double nIncrLoansOthBank;

    /*
     * 回购业务资金净增加额
     */
    private Double nCapIncrRepur;

    /*
     * 收到其他与经营活动有关的现金
     */
    private Double cFrOthOperateA;

    /*
     * 经营活动现金流入小计
     */
    private Double cInfFrOperateA;

    /*
     * 购买商品、接受劳务支付的现金
     */
    private Double cPaidGoodsS;

    /*
     * 支付给职工以及为职工支付的现金
     */
    private Double cPaidToForEmpl;

    /*
     * 支付的各项税费
     */
    private Double cPaidForTaxes;

    /*
     * 客户贷款及垫款净增加额
     */
    private Double nIncrCltLoanAdv;

    /*
     * 存放央行和同业款项净增加额
     */
    private Double nIncrDepCbob;

    /*
     * 支付原保险合同赔付款项的现金
     */
    private Double cPayClaimsOrigInco;

    /*
     * 支付手续费的现金
     */
    private Double payHandlingChrg;

    /*
     * 支付保单红利的现金
     */
    private Double payCommInsurPlcy;

    /*
     * 支付其他与经营活动有关的现金
     */
    private Double othCashPayOperAct;

    /*
     * 经营活动现金流出小计
     */
    private Double stCashOutAct;

    /*
     * 经营活动产生的现金流量净额
     */
    private Double nCashflowAct;

    /*
     * 收到其他与投资活动有关的现金
     */
    private Double othRecpRalInvAct;

    /*
     * 收回投资收到的现金
     */
    private Double cDispWithdrwlInvest;

    /*
     * 取得投资收益收到的现金
     */
    private Double cRecpReturnInvest;

    /*
     * 处置固定资产、无形资产和其他长期资产收回的现金净额
     */
    private Double nRecpDispFiolta;

    /*
     * 处置子公司及其他营业单位收到的现金净额
     */
    private Double nRecpDispSobu;

    /*
     * 投资活动现金流入小计
     */
    private Double stotInflowsInvAct;

    /*
     * 购建固定资产、无形资产和其他长期资产支付的现金
     */
    private Double cPayAcqConstFiolta;

    /*
     * 投资支付的现金
     */
    private Double cPaidInvest;

    /*
     * 取得子公司及其他营业单位支付的现金净额
     */
    private Double nDispSubsOthBiz;

    /*
     * 支付其他与投资活动有关的现金
     */
    private Double othPayRalInvAct;

    /*
     * 质押贷款净增加额
     */
    private Double nIncrPledgeLoan;

    /*
     * 投资活动现金流出小计
     */
    private Double stotOutInvAct;

    /*
     * 投资活动产生的现金流量净额
     */
    private Double nCashflowInvAct;

    /*
     * 取得借款收到的现金
     */
    private Double cRecpBorrow;

    /*
     * 发行债券收到的现金
     */
    private Double procIssueBonds;

    /*
     * 收到其他与筹资活动有关的现金
     */
    private Double othCashRecpRalFncAct;

    /*
     * 筹资活动现金流入小计
     */
    private Double stotCashInFncAct;

    /*
     * 企业自由现金流量
     */
    private Double freeCashflow;

    /*
     * 偿还债务支付的现金
     */
    private Double cPrepayAmtBorr;

    /*
     * 分配股利、利润或偿付利息支付的现金
     */
    private Double cPayDistDpcpIntExp;

    /*
     * 其中:子公司支付给少数股东的股利、利润
     */
    private Double inclDvdProfitPaidScMs;

    /*
     * 支付其他与筹资活动有关的现金
     */
    private Double othCashpayRalFncAct;

    /*
     * 筹资活动现金流出小计
     */
    private Double stotCashoutFncAct;

    /*
     * 筹资活动产生的现金流量净额
     */
    private Double nCashFlowsFncAct;

    /*
     * 汇率变动对现金的影响
     */
    private Double effFxFluCash;

    /*
     * 吸收投资收到的现金
     */
    private Double cRecpCapContrib;

    /*
     * 其中:子公司吸收少数股东投资收到的现金
     */
    private Double inclCashRecSaims;

    /*
     * 未确认投资损失
     */
    private Double unconInvestLoss;

    /*
     * 加:资产减值准备
     */
    private Double provDeprAssets;

    /*
     * 固定资产折旧、油气资产折耗、生产性生物资产折旧
     */
    private Double deprFaCogaDpba;

    /*
     * 无形资产摊销
     */
    private Double amortIntangAssets;

    /*
     * 长期待摊费用摊销
     */
    private Double ltAmortDeferredExp;

    /*
     * 待摊费用减少
     */
    private Double decrDeferredExp;

    /*
     * 预提费用增加
     */
    private Double incrAccExp;

    /*
     * 处置固定、无形资产和其他长期资产的损失
     */
    private Double lossDispFiolta;

    /*
     * 固定资产报废损失
     */
    private Double lossScrFa;

    /*
     * 公允价值变动损失
     */
    private Double lossFvChg;

    /*
     * 投资损失
     */
    private Double investLoss;

    /*
     * 递延所得税资产减少
     */
    private Double decrDefIncTaxAssets;

    /*
     * 递延所得税负债增加
     */
    private Double incrDefIncTaxLiab;

    /*
     * 存货的减少
     */
    private Double decrInventories;

    /*
     * 经营性应收项目的减少
     */
    private Double decrOperPayable;

    /*
     * 经营性应付项目的增加
     */
    private Double incrOperPayable;

    /*
     * 其他
     */
    private Double others;

    /*
     * 经营活动产生的现金流量净额(间接法)
     */
    private Double imNetCashflowOperAct;

    /*
     * 债务转为资本
     */
    private Double convDebtIntoCap;

    /*
     * 一年内到期的可转换公司债券
     */
    private Double convCopbondsDueWithin1y;

    /*
     * 融资租入固定资产
     */
    private Double faFncLeases;

    /*
     * 拆出资金净增加额
     */
    private Double netDismCapitalAdd;

    /*
     * 代理买卖证券收到的现金净额(元)
     */
    private Double netCashReceSec;

    /*
     * 信用减值损失
     */
    private Double creditImpaLoss;

    /*
     * 使用权资产折旧
     */
    private Double useRightAssetDep;

    /*
     * 其他资产减值损失
     */
    private Double othLossAsset;
}
