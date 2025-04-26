package cn.initialfire.tushare.api.stock.responsedata;

import lombok.Data;

@Data
public class StockCashflowReport {

    /**
     * 股票代码
     */
    private String tsCode;

    /**
     * 公告日期
     */
    private String annDate;

    /**
     * 实际公告日期
     */
    private String fAnnDate;

    /**
     * 报告期
     */
    private String endDate;

    /**
     * 公司类型
     */
    private String compType;

    /**
     * 报表类型
     */
    private String reportType;

    /**
     * 期初现金及现金等价物余额
     */
    private Float cCashEquBegPeriod;

    /**
     * 期末现金及现金等价物余额
     */
    private Float cCashEquEndPeriod;

    /**
     * 期末现金及现金等价物余额(境内)
     */
    private Float cCashEquEndPeriodIm;

    /**
     * 期末现金及现金等价物余额(境外)
     */
    private Float cCashEquEndPeriodOm;

    /**
     * 经营活动产生的现金流量净额
     */
    private Float nCashflowAct;

    /**
     * 经营活动现金流入小计
     */
    private Float stotInflowOperAct;

    /**
     * 经营活动现金流出小计
     */
    private Float stotOutflowOperAct;

    /**
     * 销售商品、提供劳务收到的现金
     */
    private Float cInfFrSaleSg;

    /**
     * 收到其他与经营活动有关的现金
     */
    private Float cInfFrOthOperateAct;

    /**
     * 客户存款和同业存放款项净增加额
     */
    private Float cInfFrNmDepDec;

    /**
     * 收到原保险合同保费取得的现金
     */
    private Float cInfFrPremRec;

    /**
     * 收到再保险业务现金净额
     */
    private Float cInfFrCompInsurRec;

    /**
     * 收到的税费返还
     */
    private Float cInfFrTaxreturn;

    /**
     * 购买商品、接受劳务支付的现金
     */
    private Float cPaidGoodsS;

    /**
     * 支付给职工以及为职工支付的现金
     */
    private Float cPaidToForEmpl;

    /**
     * 支付的各项税费
     */
    private Float cPaidForTaxes;
    
    /**
     * 支付其他与经营活动有关的现金
     */
    private Float cPaidForOthOperAct;

    /**
     * 处置交易性金融资产净增加额
     */
    private Float nIncrDispTfa;

    /**
     * 处置可供出售金融资产净增加额
     */
    private Float nIncrDispFaas;

    /**
     * 客户贷款及垫款净增加额
     */
    private Float nIncrLoansCb;

    /**
     * 存放中央银行和同业款项净增加额
     */
    private Float nIncrDepCbob;

    /**
     * 支付原保险合同赔付款项的现金
     */
    private Float cPaidClaimsOrigInco;

    /**
     * 投资活动产生的现金流量净额
     */
    private Float nCashflowInvAct;

    /**
     * 投资活动现金流入小计
     */
    private Float stotInflowInvAct;

    /**
     * 投资活动现金流出小计
     */
    private Float stotOutflowInvAct;

    /**
     * 收回投资收到的现金
     */
    private Float cRecpReturnInvest;

    /**
     * 取得投资收益收到的现金
     */
    private Float cRecpInvestIncome;

    /**
     * 处置固定资产、无形资产和其他长期资产收回的现金净额
     */
    private Float nRecpDispFiolta;

    /**
     * 处置子公司及其他营业单位收到的现金净额
     */
    private Float nRecpDispSobu;

    /**
     * 收到其他与投资活动有关的现金
     */
    private Float cRecpOthInvAct;

    /**
     * 购建固定资产、无形资产和其他长期资产支付的现金
     */
    private Float cPaidAcqConstFiolta;

    /**
     * 投资支付的现金
     */
    private Float cPaidInvest;

    /**
     * 取得子公司及其他营业单位支付的现金净额
     */
    private Float nPaidAcqSobu;

    /**
     * 支付其他与投资活动有关的现金
     */
    private Float cPaidOthInvAct;

    /**
     * 筹资活动产生的现金流量净额
     */
    private Float nCashflowFinAct;

    /**
     * 筹资活动现金流入小计
     */
    private Float stotInflowFinAct;

    /**
     * 筹资活动现金流出小计
     */
    private Float stotOutflowFinAct;

    /**
     * 取得借款收到的现金
     */
    private Float cRecpBorrow;

    /**
     * 发行债券收到的现金
     */
    private Float procIssueBonds;

    /**
     * 收到其他与筹资活动有关的现金
     */
    private Float cRecpOthFinAct;

    /**
     * 偿还债务支付的现金
     */
    private Float cPrepayAmtBorr;

    /**
     * 分配股利、利润或偿付利息支付的现金
     */
    private Float cPaidDistDpcpIntExp;

    /**
     * 支付其他与筹资活动有关的现金
     */
    private Float cPaidOthFinAct;

    /**
     * 汇率变动对现金及现金等价物的影响
     */
    private Float nEffectFxRates;

    /**
     * 更新标识
     */
    private String updateFlag;

}
