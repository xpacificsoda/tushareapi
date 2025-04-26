package cn.initialfire.tushare.api.stock.requestdata;

import lombok.Data;

@Data
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
