package cn.initialfire.tushare.api.stock.responsedata;

import lombok.Data;

@Data
public class StockBalanceSheetReport {
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
     * 报告类型
     */
    private String reportType;

    /**
     * 公司类型
     */
    private String compType;

    /**
     * 报告类型(1年度 2半年度 3季度)
     */
    private String endType;

    /**
     * 货币资金
     */
    private Float moneyCap;

    /**
     * 结算备付金
     */
    private Float settRsrv;

    /**
     * 拆出资金
     */
    private Float loantoOthBankFi;

    /**
     * 交易性金融资产
     */
    private Float tradAsset;

    /**
     * 衍生金融资产
     */
    private Float derivAssets;

    /**
     * 应收票据及应收账款
     */
    private Float accountsReceivBill;

    /**
     * 应收票据
     */
    private Float notesReceiv;

    /**
     * 应收账款
     */
    private Float accountsReceiv;

    /**
     * 应收款项融资
     */
    private Float receivFinancing;

    /**
     * 预付款项
     */
    private Float prepayment;

    /**
     * 其他应收款合计
     */
    private Float othRcvTotal;

    /**
     * 应收利息
     */
    private Float intReceiv;

    /**
     * 应收股利
     */
    private Float divReceiv;

    /**
     * 其他应收款
     */
    private Float othReceiv;

    /**
     * 买入返售金融资产
     */
    private Float purResaleFa;

    /**
     * 存货
     */
    private Float inventories;

    /**
     * 合同资产
     */
    private Float contractAssets;

    /**
     * 持有待售的资产
     */
    private Float hfsAssets;

    /**
     * 一年内到期的非流动资产
     */
    private Float ncaWithin1y;

    /**
     * 其他流动资产
     */
    private Float othCurAssets;

    /**
     * 流动资产合计
     */
    private Float totalCurAssets;

    /**
     * 发放贷款及垫款
     */
    private Float decrInDisbur;

    /**
     * 债权投资
     */
    private Float debtInvest;

    /**
     * 其他债权投资
     */
    private Float othDebtInvest;

    /**
     * 长期应收款
     */
    private Float ltRec;

    /**
     * 长期股权投资
     */
    private Float ltEqtInvest;

    /**
     * 其他权益工具投资
     */
    private Float othEqInvest;

    /**
     * 其他非流动金融资产
     */
    private Float othIlliqFinAssets;

    /**
     * 投资性房地产
     */
    private Float investRealEstate;

    /**
     * 固定资产合计
     */
    private Float fixAssetsTotal;

    /**
     * 固定资产
     */
    private Float fixAssets;

    /**
     * 在建工程合计
     */
    private Float cipTotal;

    /**
     * 在建工程
     */
    private Float cip;

    /**
     * 工程物资
     */
    private Float constMaterials;

    /**
     * 固定资产清理
     */
    private Float fixedAssetsDisp;

    /**
     * 生产性生物资产
     */
    private Float producBioAssets;

    /**
     * 油气资产
     */
    private Float oilAndGasAssets;

    /**
     * 使用权资产
     */
    private Float useRightAssets;

    /**
     * 无形资产
     */
    private Float intanAssets;

    /**
     * 开发支出
     */
    private Float rAndD;

    /**
     * 商誉
     */
    private Float goodwill;

    /**
     * 长期待摊费用
     */
    private Float ltAmorExp;

    /**
     * 递延所得税资产
     */
    private Float deferTaxAssets;

    /**
     * 其他非流动资产
     */
    private Float othNca;

    /**
     * 非流动资产合计
     */
    private Float totalNca;

    /**
     * 资产总计
     */
    private Float totalAssets;

    /**
     * 短期借款
     */
    private Float stBorr;

    /**
     * 向中央银行借款
     */
    private Float cbBorr;

    /**
     * 吸收存款及同业存放
     */
    private Float deposIbDeposits;

    /**
     * 拆入资金
     */
    private Float loanOthBank;

    /**
     * 贵金属
     */
    private Float precMetals;

    /**
     * 应收分保未到期责任准备金
     */
    private Float rrReinsUnePrem;

    /**
     * 应收分保未决赔款准备金
     */
    private Float rrReinsOutstdCla;

    /**
     * 应收分保寿险责任准备金
     */
    private Float rrReinsLinsLiab;

    /**
     * 应收分保长期健康险责任准备金
     */
    private Float rrReinsLthinsLiab;

    /**
     * 存出资本保证金
     */
    private Float refundCapDepos;

    /**
     * 存出保证金
     */
    private Float refundDepos;

    /**
     * 独立账户资产
     */
    private Float indepAcctAssets;

    /**
     * 其中：客户资金存款
     */
    private Float clientDepos;

    /**
     * 其中：客户备付金
     */
    private Float clientProv;

    /**
     * 其中：交易席位费
     */
    private Float transacSeatFee;

    /**
     * 应收款项类投资
     */
    private Float investAsReceiv;

    /**
     * 应收款项
     */
    private Float accReceivable;

    /**
     * 待摊费用
     */
    private Float amorExp;

    /**
     * 可供出售金融资产
     */
    private Float faAvailForSale;

    /**
     * 持有至到期投资
     */
    private Float htmInvest;

    /**
     * 定期存款
     */
    private Float timeDeposits;

    /**
     * 其他资产
     */
    private Float othAssets;

    /**
     * 现金及存放中央银行款项
     */
    private Float cashReserCb;

    /**
     * 存放同业和其它金融机构款项
     */
    private Float deposInOthBfi;

    /**
     * 应收保费
     */
    private Float premiumReceiv;

    /**
     * 应收分保账款
     */
    private Float reinsurReceiv;

    /**
     * 应收分保合同准备金
     */
    private Float reinsurResReceiv;

    /**
     * 融出资金
     */
    private Float lendingFunds;

    /**
     * 以摊余成本计量的金融资产
     */
    private Float costFinAssets;

    /**
     * 以公允价值计量且其变动计入其他综合收益的金融资产
     */
    private Float fairValueFinAssets;

    /**
     * 其他应付款合计
     */
    private Float othPayTotal;

    /**
     * 长期应付款合计
     */
    private Float longPayTotal;

    /**
     * 其他权益工具:永续债
     */
    private Float othEqPpbond;

    /**
     * 租赁负债
     */
    private Float leaseLiab;

    /**
     * 期末总股本
     */
    private Float totalShare;

    /**
     * 资本公积金
     */
    private Float capRese;

    /**
     * 盈余公积金
     */
    private Float surplusRese;

    /**
     * 未分配利润
     */
    private Float undistrPorfit;

    /**
     * 专项储备
     */
    private Float specialRese;

    /**
     * 应交税费
     */
    private Float taxesPayable;

    /**
     * 应付利息
     */
    private Float intPayable;

    /**
     * 应付股利
     */
    private Float divPayable;

    /**
     * 其他应付款
     */
    private Float othPayable;

    /**
     * 预提费用
     */
    private Float accExp;

    /**
     * 递延收益
     */
    private Float deferredInc;

    /**
     * 应付短期债券
     */
    private Float stBondsPayable;

    /**
     * 应付分保账款
     */
    private Float payableToReinsurer;

    /**
     * 保险合同准备金
     */
    private Float rsrvInsurCont;

    /**
     * 代理买卖证券款
     */
    private Float actingTradingSec;

    /**
     * 代理承销证券款
     */
    private Float actingUwSec;

    /**
     * 衍生金融负债
     */
    private Float derivLiab;

    /**
     * 吸收存款
     */
    private Float depos;

    /**
     * 代理业务负债
     */
    private Float agencyBusLiab;

    /**
     * 预收保费
     */
    private Float premReceivAdva;

    /**
     * 保户质押贷款
     */
    private Float phPledgeLoans;

    /**
     * 应付赔付款
     */
    private Float indemPayable;

    /**
     * 应付保单红利
     */
    private Float policyDivPayable;

    /**
     * 应付短期融资款
     */
    private Float stFinPayable;

    /**
     * 应付款项
     */
    private Float payables;

    /**
     * 持有待售的负债
     */
    private Float hfsSales;

    /**
     * 应付票据及应付账款
     */
    private Float accountsPay;

    /**
     * 合同负债
     */
    private Float contractLiab;

    /**
     * 同业和其它金融机构存放款项
     */
    private Float deposOthBfi;

    /**
     * 存入保证金
     */
    private Float deposReceived;

    /**
     * 一年内到期的非流动负债
     */
    private Float nonCurLiabDue1y;

    /**
     * 其他流动负债
     */
    private Float othCurLiab;

    /**
     * 流动负债合计
     */
    private Float totalCurLiab;

    /**
     * 长期借款
     */
    private Float ltBorr;

    /**
     * 应付债券
     */
    private Float bondPayable;

    /**
     * 长期应付款
     */
    private Float ltPayable;

    /**
     * 专项应付款
     */
    private Float specificPayables;

    /**
     * 预计负债
     */
    private Float estimatedLiab;

    /**
     * 递延所得税负债
     */
    private Float deferTaxLiab;

    /**
     * 递延收益-非流动负债
     */
    private Float deferIncNonCurLiab;

    /**
     * 长期应付职工薪酬
     */
    private Float ltPayrollPayable;

    /**
     * 其他综合收益
     */
    private Float othCompIncome;

    /**
     * 其他权益工具
     */
    private Float othEqtTools;

    /**
     * 其他权益工具(优先股)
     */
    private Float othEqtToolsPShr;

    /**
     * 未到期责任准备金
     */
    private Float reserUnePrem;

    /**
     * 未决赔款准备金
     */
    private Float reserOutstdClaims;

    /**
     * 寿险责任准备金
     */
    private Float reserLinsLiab;

    /**
     * 长期健康险责任准备金
     */
    private Float reserLthinsLiab;

    /**
     * 独立账户负债
     */
    private Float indeptAccLiab;

    /**
     * 其中:质押借款
     */
    private Float pledgeBorr;

    /**
     * 其他非流动负债
     */
    private Float othNcl;

    /**
     * 非流动负债合计
     */
    private Float totalNcl;

    /**
     * 其他负债
     */
    private Float othLiab;

    /**
     * 负债合计
     */
    private Float totalLiab;

    /**
     * 库存股
     */
    private Float treasuryShare;

    /**
     * 保户储金及投资款
     */
    private Float phInvest;

    /**
     * 一般风险准备
     */
    private Float ordinRiskReser;

    /**
     * 外币报表折算差额
     */
    private Float forexDiffer;

    /**
     * 未确认的投资损失
     */
    private Float investLossUnconf;

    /**
     * 少数股东权益
     */
    private Float minorityInt;

    /**
     * 股东权益合计(不含少数股东权益)
     */
    private Float totalHldrEqyExcMinInt;

    /**
     * 股东权益合计(含少数股东权益)
     */
    private Float totalHldrEqyIncMinInt;

    /**
     * 负债及股东权益总计
     */
    private Float totalLiabHldrEqy;

    /**
     * 更新标识
     */
    private String updateFlag;

}
