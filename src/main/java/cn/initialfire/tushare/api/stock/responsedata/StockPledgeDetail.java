package cn.initialfire.tushare.api.stock.responsedata;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockPledgeDetail {
    // TS代码
    private String tsCode;

    // 公告日期
    private String annDate;

    // 股东名称
    private String holderName;

    // 质押数量（万股）
    private Double pledgeAmount;

    // 质押开始日期
    private String startDate;

    // 质押结束日期
    private String endDate;

    // 是否已解押
    private String isRelease;

    // 解押日期
    private String releaseDate;

    // 质押方
    private String pledgor;

    // 持股总数（万股）
    private Double holdingAmount;

    // 质押总数（万股）
    private Double pledgedAmount;

    // 本次质押占总股本比例
    private Double pTotalRatio;

    // 持股总数占总股本比例
    private Double hTotalRatio; 

    // 是否回购
    private String isBuyback;


}
