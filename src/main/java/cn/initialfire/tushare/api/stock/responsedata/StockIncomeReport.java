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
    private Double basicEps;

    /**
     * 稀释每股收益
     */
    private Double dilutedEps;

    /**
     * 营业总收入
     */
    private Double totalRevenue;

    /**
     * 营业收入
     */
    private Double revenue;

    /**
     * 营业总成本
     */
    private Double totalCogs;

    /**
     * 营业成本
     */
    private Double operCost;

    /**
     * 营业总成本（二）
     */
    private Double totalOpcost;

    /**
     * 营业支出
     */
    private Double operExp;

    /**
     * 销售费用
     */
    private Double sellExp;

    /**
     * 研发费用
     */
    private Double rdExp;

    /**
     * 管理费用
     */
    private Double adminExp;

    /**
     * 财务费用
     */
    private Double finExp;

    /**
     * 财务费用:利息费用
     */
    private Double finExpIntExp;

    /**
     * 财务费用:利息收入
     */
    private Double finExpIntInc;

    /**
     * 利息收入
     */
    private Double intIncome;

    /**
     * 利息支出
     */
    private Double intExp;

    /**
     * 资产减值损失
     */
    private Double assetsImpairLoss;

    /**
     * 其他资产减值损失
     */
    private Double othImpairLossAssets;

    /**
     * 其他经营净收益
     */
    private Double nOthIncome;

    /**
     * 其他业务净收益
     */
    private Double nOthBIncome;

    /**
     * 其他业务收入
     */
    private Double othBIncome;

    /**
     * 其他业务成本
     */
    private Double otherBusCost;

    /**
     * 投资收益
     */
    private Double investIncome;

    /**
     * 资产处置收益
     */
    private Double assImpGain;

    /**
     * 非流动资产处置损失
     */
    private Double ncaDisploss;

    /**
     * 汇兑收益
     */
    private Double forexGain;

    /**
     * 息税前利润
     */
    private Double ebit;

    /**
     * 息税折旧摊销前利润
     */
    private Double ebitda;

    /**
     * 所得税费用
     */
    private Double incomeTax;

    /**
     * 营业税金及附加
     */
    private Double bizTaxSurchg;

    /**
     * 营业利润
     */
    private Double operateProfit;

    /**
     * 营业外收入
     */
    private Double nonOperIncome;

    /**
     * 营业外支出
     */
    private Double nonOperExp;

    /**
     * 利润总额
     */
    private Double totalProfit;

    /**
     * 净利润(含少数股东损益)
     */
    private Double nIncome;

    /**
     * 净利润(不含少数股东损益)
     */
    private Double nIncomeAttrP;

    /**
     * 扣除非经常性损益后的净利润（更正前）
     */
    private Double netAfterNrLpCorrect;

    /**
     * 少数股东损益
     */
    private Double minorityGain;

    /**
     * 其他综合收益
     */
    private Double othComprIncome;

    /**
     * 综合收益总额
     */
    private Double tComprIncome;

    /**
     * 归属于母公司(或股东)的综合收益总额
     */
    private Double comprIncAttrP;

    /**
     * 归属于少数股东的综合收益总额
     */
    private Double comprIncAttrMs;

    /**
     * 可供分配利润
     */
    private Double distableProfit;

    /**
     * 保险业务支出
     */
    private Double insuranceExp;

    /**
     * 未分配利润
     */
    private Double undistProfit;

    /**
     * 信用减值损失
     */
    private Double creditImpaLoss;

    /**
     * 其他收益
     */
    private Double othIncome;

    /**
     * 资产处置收益
     */
    private Double assetDispIncome;

    /**
     * 持续经营净利润
     */
    private Double continuedNetProfit;

    /**
     * 终止经营净利润
     */
    private Double endNetProfit;

    /**
     * 对联营企业和合营企业的投资收益
     */
    private Double assInvestIncome;

    /**
     * 已赚保费
     */
    private Double premEarned;

    /**
     * 手续费及佣金收入
     */
    private Double commIncome;

    /**
     * 手续费及佣金净收入
     */
    private Double nCommisIncome;

    /**
     * 保险业务收入
     */
    private Double premIncome;

    /**
     * 分出保费
     */
    private Double outPrem;

    /**
     * 提取未到期责任准备金
     */
    private Double unePremReser;

    /**
     * 分保费收入
     */
    private Double reinsIncome;

    /**
     * 证券承销业务净收入
     */
    private Double nSecTbIncome;

    /**
     * 证券承销净收益
     */
    private Double nSecUwIncome;

    /**
     * 受托客户资产管理业务净收入
     */
    private Double nAssetMgIncome;

    /**
     * 以公允价值计量且其变动计入当期损益的金融资产净收益
     */
    private Double fvValueChgGain;

    /**
     * 手续费及佣金支出
     */
    private Double commExp;

    /**
     * 退保金
     */
    private Double premRefund;

    /**
     * 赔付总支出
     */
    private Double compensPayout;

    /**
     * 提取保险责任准备金
     */
    private Double reserInsurLiab;

    /**
     * 保户红利支出
     */
    private Double divPayt;

    /**
     * 分保费用
     */
    private Double reinsExp;

    /**
     * 摊回赔付支出
     */
    private Double compensPayoutRefu;

    /**
     * 摊回保险责任准备金
     */
    private Double insurReserRefu;

    /**
     * 摊回分保费用
     */
    private Double reinsCostRefund;

    /**
     * 盈余公积转入
     */
    private Double transferSurplusRese;

    /**
     * 住房周转金转入
     */
    private Double transferHousingImpre;

    /**
     * 其他转入
     */
    private Double transferOth;

    /**
     * 调整以前年度损益
     */
    private Double adjLossgain;

    /**
     * 提取法定盈余公积
     */
    private Double withdraLegalSurplus;

    /**
     * 提取法定公益金
     */
    private Double withdraLegalPubfund;

    /**
     * 提取企业发展基金
     */
    private Double withdraBizDevfund;

    /**
     * 提取储备基金
     */
    private Double withdraReseFund;

    /**
     * 提取任意盈余公积金
     */
    private Double withdraOthErsu;

    /**
     * 职工奖金福利
     */
    private Double workersWelfare;

    /**
     * 可分配给股东的利润
     */
    private Double distrProfitShrhder;

    /**
     * 应付优先股股利
     */
    private Double prfsharePayableDvd;

    /**
     * 应付普通股股利
     */
    private Double comsharePayableDvd;

    /**
     * 转作股本的普通股股利
     */
    private Double capitComstockDiv;

    /**
     * 套期保值业务净收益
     */
    private Double netExpoHedgingBenefits;

    /**
     * 以摊余成本计量的金融资产终止确认收益
     */
    private Double amodcostFinAssets;

    /**
     * 更新标识
     */
    private String updateFlag;
}
