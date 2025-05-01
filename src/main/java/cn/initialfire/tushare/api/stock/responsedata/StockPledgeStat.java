package cn.initialfire.tushare.api.stock.responsedata;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockPledgeStat {
    // TS代码
    private String tsCode;

    // 截至日期
    private String endDate;

    // 质押次数
    private Integer pledgeCnt;

    // 无限售股质押数量（万）
    private Double unrestPledge;

    // 限售股质押数量（万）
    private Double restPledge;

    // 总股本
    private Double totalShare;

    // 质押比例
    private Double pledgeRatio;

}
