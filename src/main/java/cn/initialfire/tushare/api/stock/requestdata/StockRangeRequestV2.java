package cn.initialfire.tushare.api.stock.requestdata;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockRangeRequestV2 {

    // 股票代码
    private String tsCode;

    // 公告日期
    private String annDate;

    // 开始日期
    private String startDate;

    // 结束日期
    private String endDate;
}
