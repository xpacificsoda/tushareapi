package cn.initialfire.tushare.api.stock.requestdata;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class StockRangeRequestV2 extends BaseRequestData {

    // 股票代码
    private String tsCode;

    // 公告日期
    private String annDate;

    // 开始日期
    private String startDate;

    // 结束日期
    private String endDate;
}
