package cn.initialfire.tushare.api.stock.responsedata;

import lombok.Data;

@Data
/**
 * 股票利润表
 */
public class StockIncomeReport {
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
     * 报告类型
     */
    private String endType;

    /**
     * 基本每股收益
     */
    private Float basicEps;

    /**
     * 稀释每股收益
     */
    private Float dilutedEps;

    /**
     * 营业总收入
     */
    private Float totalRevenue;

    /**
     * 营业收入
     */
    private Float revenue;

    /**
     * 营业总成本
     */
    private Float totalCogs;

    /**
     * 营业成本
     */
    private Float operCost;

    /**
     * 营业总成本（二）
     */
    private Float totalOpcost;

    /**
     * 营业支出
     */
    private Float operExp;

    /**
     * 销售费用
     */
    private Float sellExp;

    /**
     * 研发费用
     */
    private Float rdExp;

    /**
     * 管理费用
     */
    private Float adminExp;

    /**
     * 财务费用
     */
    private Float finExp;

    /**
     * 财务费用:利息费用
     */
    private Float finExpIntExp;

    /**
     * 财务费用:利息收入
     */
    private Float finExpIntInc;

    /**
     * 利息收入
     */
    private Float intIncome;

    /**
     * 利息支出
     */
    private Float intExp;

    /**
     * 资产减值损失
     */
    private Float assetsImpairLoss;

    /**
     * 其他资产减值损失
     */
    private Float othImpairLossAssets;

    /**
     * 其他经营净收益
     */
    private Float nOthIncome;

    /**
     * 其他业务净收益
     */
    private Float nOthBIncome;

    /**
     * 其他业务收入
     */
    private Float othBIncome;

    /**
     * 其他业务成本
     */
    private Float otherBusCost;

    /**
     * 投资收益
     */
    private Float investIncome;

    /**
     * 资产处置收益
     */
    private Float assImpGain;

    /**
     * 非流动资产处置损失
     */
    private Float ncaDisploss;

    /**
     * 汇兑收益
     */
    private Float forexGain;

    /**
     * 息税前利润
     */
    private Float ebit;

    /**
     * 息税折旧摊销前利润
     */
    private Float ebitda;

    /**
     * 所得税费用
     */
    private Float incomeTax;

    /**
     * 营业税金及附加
     */
    private Float bizTaxSurchg;

    /**
     * 营业利润
     */
    private Float operateProfit;

    /**
     * 营业外收入
     */
    private Float nonOperIncome;

    /**
     * 营业外支出
     */
    private Float nonOperExp;

    /**
     * 利润总额
     */
    private Float totalProfit;

    /**
     * 净利润(含少数股东损益)
     */
    private Float nIncome;

    /**
     * 净利润(不含少数股东损益)
     */
    private Float nIncomeAttrP;

    /**
     * 扣除非经常性损益后的净利润（更正前）
     */
    private Float netAfterNrLpCorrect;

    /**
     * 少数股东损益
     */
    private Float minorityGain;

    /**
     * 其他综合收益
     */
    private Float othComprIncome;

    /**
     * 综合收益总额
     */
    private Float tComprIncome;

    /**
     * 归属于母公司(或股东)的综合收益总额
     */
    private Float comprIncAttrP;

    /**
     * 归属于少数股东的综合收益总额
     */
    private Float comprIncAttrMs;

    /**
     * 可供分配利润
     */
    private Float distableProfit;

    /**
     * 保险业务支出
     */
    private Float insuranceExp;

    /**
     * 未分配利润
     */
    private Float undistProfit;

    /**
     * 信用减值损失
     */
    private Float creditImpaLoss;

    /**
     * 其他收益
     */
    private Float othIncome;

    /**
     * 资产处置收益
     */
    private Float assetDispIncome;

    /**
     * 持续经营净利润
     */
    private Float continuedNetProfit;

    /**
     * 终止经营净利润
     */
    private Float endNetProfit;

    /**
     * 对联营企业和合营企业的投资收益
     */
    private Float assInvestIncome;

    /**
     * 已赚保费
     */
    private Float premEarned;

    /**
     * 手续费及佣金收入
     */
    private Float commIncome;

    /**
     * 手续费及佣金净收入
     */
    private Float nCommisIncome;

    /**
     * 保险业务收入
     */
    private Float premIncome;

    /**
     * 分出保费
     */
    private Float outPrem;

    /**
     * 提取未到期责任准备金
     */
    private Float unePremReser;

    /**
     * 分保费收入
     */
    private Float reinsIncome;

    /**
     * 证券承销业务净收入
     */
    private Float nSecTbIncome;

    /**
     * 证券承销净收益
     */
    private Float nSecUwIncome;

    /**
     * 受托客户资产管理业务净收入
     */
    private Float nAssetMgIncome;

    /**
     * 以公允价值计量且其变动计入当期损益的金融资产净收益
     */
    private Float fvValueChgGain;

    /**
     * 手续费及佣金支出
     */
    private Float commExp;

    /**
     * 退保金
     */
    private Float premRefund;

    /**
     * 赔付总支出
     */
    private Float compensPayout;

    /**
     * 提取保险责任准备金
     */
    private Float reserInsurLiab;

    /**
     * 保户红利支出
     */
    private Float divPayt;

    /**
     * 分保费用
     */
    private Float reinsExp;

    /**
     * 摊回赔付支出
     */
    private Float compensPayoutRefu;

    /**
     * 摊回保险责任准备金
     */
    private Float insurReserRefu;

    /**
     * 摊回分保费用
     */
    private Float reinsCostRefund;

    /**
     * 盈余公积转入
     */
    private Float transferSurplusRese;

    /**
     * 住房周转金转入
     */
    private Float transferHousingImpre;

    /**
     * 其他转入
     */
    private Float transferOth;

    /**
     * 调整以前年度损益
     */
    private Float adjLossgain;

    /**
     * 提取法定盈余公积
     */
    private Float withdraLegalSurplus;

    /**
     * 提取法定公益金
     */
    private Float withdraLegalPubfund;

    /**
     * 提取企业发展基金
     */
    private Float withdraBizDevfund;

    /**
     * 提取储备基金
     */
    private Float withdraReseFund;

    /**
     * 提取任意盈余公积金
     */
    private Float withdraOthErsu;

    /**
     * 职工奖金福利
     */
    private Float workersWelfare;

    /**
     * 可分配给股东的利润
     */
    private Float distrProfitShrhder;

    /**
     * 应付优先股股利
     */
    private Float prfsharePayableDvd;

    /**
     * 应付普通股股利
     */
    private Float comsharePayableDvd;

    /**
     * 转作股本的普通股股利
     */
    private Float capitComstockDiv;

    /**
     * 套期保值业务净收益
     */
    private Float netExpoHedgingBenefits;

    /**
     * 以摊余成本计量的金融资产终止确认收益
     */
    private Float amodcostFinAssets;

    /**
     * 更新标识
     */
    private String updateFlag;
}
