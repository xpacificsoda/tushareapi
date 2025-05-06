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
    private Double moneyCap;

    /**
     * 结算备付金
     */
    private Double settRsrv;

    /**
     * 拆出资金
     */
    private Double loantoOthBankFi;

    /**
     * 交易性金融资产
     */
    private Double tradAsset;

    /**
     * 衍生金融资产
     */
    private Double derivAssets;

    /**
     * 应收票据及应收账款
     */
    private Double accountsReceivBill;

    /**
     * 应收票据
     */
    private Double notesReceiv;

    /**
     * 应收账款
     */
    private Double accountsReceiv;

    /**
     * 应收款项融资
     */
    private Double receivFinancing;

    /**
     * 预付款项
     */
    private Double prepayment;

    /**
     * 其他应收款合计
     */
    private Double othRcvTotal;

    /**
     * 应收利息
     */
    private Double intReceiv;

    /**
     * 应收股利
     */
    private Double divReceiv;

    /**
     * 其他应收款
     */
    private Double othReceiv;

    /**
     * 买入返售金融资产
     */
    private Double purResaleFa;

    /**
     * 存货
     */
    private Double inventories;

    /**
     * 合同资产
     */
    private Double contractAssets;

    /**
     * 持有待售的资产
     */
    private Double hfsAssets;

    /**
     * 一年内到期的非流动资产
     */
    private Double ncaWithin1y;

    /**
     * 其他流动资产
     */
    private Double othCurAssets;

    /**
     * 流动资产合计
     */
    private Double totalCurAssets;

    /**
     * 发放贷款及垫款
     */
    private Double decrInDisbur;

    /**
     * 债权投资
     */
    private Double debtInvest;

    /**
     * 其他债权投资
     */
    private Double othDebtInvest;

    /**
     * 长期应收款
     */
    private Double ltRec;

    /**
     * 长期股权投资
     */
    private Double ltEqtInvest;

    /**
     * 其他权益工具投资
     */
    private Double othEqInvest;

    /**
     * 其他非流动金融资产
     */
    private Double othIlliqFinAssets;

    /**
     * 投资性房地产
     */
    private Double investRealEstate;

    /**
     * 固定资产合计
     */
    private Double fixAssetsTotal;

    /**
     * 固定资产
     */
    private Double fixAssets;

    /**
     * 在建工程合计
     */
    private Double cipTotal;

    /**
     * 在建工程
     */
    private Double cip;

    /**
     * 工程物资
     */
    private Double constMaterials;

    /**
     * 固定资产清理
     */
    private Double fixedAssetsDisp;

    /**
     * 生产性生物资产
     */
    private Double producBioAssets;

    /**
     * 油气资产
     */
    private Double oilAndGasAssets;

    /**
     * 使用权资产
     */
    private Double useRightAssets;

    /**
     * 无形资产
     */
    private Double intanAssets;

    /**
     * 开发支出
     */
    private Double rAndD;

    /**
     * 商誉
     */
    private Double goodwill;

    /**
     * 长期待摊费用
     */
    private Double ltAmorExp;

    /**
     * 递延所得税资产
     */
    private Double deferTaxAssets;

    /**
     * 其他非流动资产
     */
    private Double othNca;

    /**
     * 非流动资产合计
     */
    private Double totalNca;

    /**
     * 资产总计
     */
    private Double totalAssets;

    /**
     * 短期借款
     */
    private Double stBorr;

    /**
     * 向中央银行借款
     */
    private Double cbBorr;

    /**
     * 吸收存款及同业存放
     */
    private Double deposIbDeposits;

    /**
     * 拆入资金
     */
    private Double loanOthBank;

    /**
     * 贵金属
     */
    private Double precMetals;

    /**
     * 应收分保未到期责任准备金
     */
    private Double rrReinsUnePrem;

    /**
     * 应收分保未决赔款准备金
     */
    private Double rrReinsOutstdCla;

    /**
     * 应收分保寿险责任准备金
     */
    private Double rrReinsLinsLiab;

    /**
     * 应收分保长期健康险责任准备金
     */
    private Double rrReinsLthinsLiab;

    /**
     * 存出资本保证金
     */
    private Double refundCapDepos;

    /**
     * 存出保证金
     */
    private Double refundDepos;

    /**
     * 独立账户资产
     */
    private Double indepAcctAssets;

    /**
     * 其中：客户资金存款
     */
    private Double clientDepos;

    /**
     * 其中：客户备付金
     */
    private Double clientProv;

    /**
     * 其中：交易席位费
     */
    private Double transacSeatFee;

    /**
     * 应收款项类投资
     */
    private Double investAsReceiv;

    /**
     * 应收款项
     */
    private Double accReceivable;

    /**
     * 待摊费用
     */
    private Double amorExp;

    /**
     * 可供出售金融资产
     */
    private Double faAvailForSale;

    /**
     * 持有至到期投资
     */
    private Double htmInvest;

    /**
     * 定期存款
     */
    private Double timeDeposits;

    /**
     * 其他资产
     */
    private Double othAssets;

    /**
     * 现金及存放中央银行款项
     */
    private Double cashReserCb;

    /**
     * 存放同业和其它金融机构款项
     */
    private Double deposInOthBfi;

    /**
     * 应收保费
     */
    private Double premiumReceiv;

    /**
     * 应收分保账款
     */
    private Double reinsurReceiv;

    /**
     * 应收分保合同准备金
     */
    private Double reinsurResReceiv;

    /**
     * 融出资金
     */
    private Double lendingFunds;

    /**
     * 以摊余成本计量的金融资产
     */
    private Double costFinAssets;

    /**
     * 以公允价值计量且其变动计入其他综合收益的金融资产
     */
    private Double fairValueFinAssets;

    /**
     * 其他应付款合计
     */
    private Double othPayTotal;

    /**
     * 长期应付款合计
     */
    private Double longPayTotal;

    /**
     * 其他权益工具:永续债
     */
    private Double othEqPpbond;

    /**
     * 租赁负债
     */
    private Double leaseLiab;

    /**
     * 期末总股本
     */
    private Double totalShare;

    /**
     * 资本公积金
     */
    private Double capRese;

    /**
     * 盈余公积金
     */
    private Double surplusRese;

    /**
     * 未分配利润
     */
    private Double undistrPorfit;

    /**
     * 专项储备
     */
    private Double specialRese;

    /**
     * 应交税费
     */
    private Double taxesPayable;

    /**
     * 应付利息
     */
    private Double intPayable;

    /**
     * 应付股利
     */
    private Double divPayable;

    /**
     * 其他应付款
     */
    private Double othPayable;

    /**
     * 预提费用
     */
    private Double accExp;

    /**
     * 递延收益
     */
    private Double deferredInc;

    /**
     * 应付短期债券
     */
    private Double stBondsPayable;

    /**
     * 应付分保账款
     */
    private Double payableToReinsurer;

    /**
     * 保险合同准备金
     */
    private Double rsrvInsurCont;

    /**
     * 代理买卖证券款
     */
    private Double actingTradingSec;

    /**
     * 代理承销证券款
     */
    private Double actingUwSec;

    /**
     * 衍生金融负债
     */
    private Double derivLiab;

    /**
     * 吸收存款
     */
    private Double depos;

    /**
     * 代理业务负债
     */
    private Double agencyBusLiab;

    /**
     * 预收保费
     */
    private Double premReceivAdva;

    /**
     * 保户质押贷款
     */
    private Double phPledgeLoans;

    /**
     * 应付赔付款
     */
    private Double indemPayable;

    /**
     * 应付保单红利
     */
    private Double policyDivPayable;

    /**
     * 应付短期融资款
     */
    private Double stFinPayable;

    /**
     * 应付款项
     */
    private Double payables;

    /**
     * 持有待售的负债
     */
    private Double hfsSales;

    /**
     * 应付票据及应付账款
     */
    private Double accountsPay;

    /**
     * 合同负债
     */
    private Double contractLiab;

    /**
     * 同业和其它金融机构存放款项
     */
    private Double deposOthBfi;

    /**
     * 存入保证金
     */
    private Double deposReceived;

    /**
     * 一年内到期的非流动负债
     */
    private Double nonCurLiabDue1y;

    /**
     * 其他流动负债
     */
    private Double othCurLiab;

    /**
     * 流动负债合计
     */
    private Double totalCurLiab;

    /**
     * 长期借款
     */
    private Double ltBorr;

    /**
     * 应付债券
     */
    private Double bondPayable;

    /**
     * 长期应付款
     */
    private Double ltPayable;

    /**
     * 专项应付款
     */
    private Double specificPayables;

    /**
     * 预计负债
     */
    private Double estimatedLiab;

    /**
     * 递延所得税负债
     */
    private Double deferTaxLiab;

    /**
     * 递延收益-非流动负债
     */
    private Double deferIncNonCurLiab;

    /**
     * 长期应付职工薪酬
     */
    private Double ltPayrollPayable;

    /**
     * 其他综合收益
     */
    private Double othCompIncome;

    /**
     * 其他权益工具
     */
    private Double othEqtTools;

    /**
     * 其他权益工具(优先股)
     */
    private Double othEqtToolsPShr;

    /**
     * 未到期责任准备金
     */
    private Double reserUnePrem;

    /**
     * 未决赔款准备金
     */
    private Double reserOutstdClaims;

    /**
     * 寿险责任准备金
     */
    private Double reserLinsLiab;

    /**
     * 长期健康险责任准备金
     */
    private Double reserLthinsLiab;

    /**
     * 独立账户负债
     */
    private Double indeptAccLiab;

    /**
     * 其中:质押借款
     */
    private Double pledgeBorr;

    /**
     * 其他非流动负债
     */
    private Double othNcl;

    /**
     * 非流动负债合计
     */
    private Double totalNcl;

    /**
     * 其他负债
     */
    private Double othLiab;

    /**
     * 负债合计
     */
    private Double totalLiab;

    /**
     * 库存股
     */
    private Double treasuryShare;

    /**
     * 保户储金及投资款
     */
    private Double phInvest;

    /**
     * 一般风险准备
     */
    private Double ordinRiskReser;

    /**
     * 外币报表折算差额
     */
    private Double forexDiffer;

    /**
     * 未确认的投资损失
     */
    private Double investLossUnconf;

    /**
     * 少数股东权益
     */
    private Double minorityInt;

    /**
     * 股东权益合计(不含少数股东权益)
     */
    private Double totalHldrEqyExcMinInt;

    /**
     * 股东权益合计(含少数股东权益)
     */
    private Double totalHldrEqyIncMinInt;

    /**
     * 负债及股东权益总计
     */
    private Double totalLiabHldrEqy;

    /**
     * 更新标识
     */
    private String updateFlag;

}
