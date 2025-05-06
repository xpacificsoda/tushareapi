package cn.initialfire.tushare.api.stock.responsedata;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockShareHolderInfo {
    private String tsCode;        // TS代码
    private String annDate;       // 公告日期
    private String endDate;       // 报告期
    private String holderName;    // 股东名称
    private Double holdAmount;    // 持有数量（股）
    private Double holdRatio;     // 占总股本比例(%)
    private Double holdFloatRatio;     // 占流通股本比例(%)
    private Double holdChange;    // 持股变动
    private String holderType;    // 股东类型
}
