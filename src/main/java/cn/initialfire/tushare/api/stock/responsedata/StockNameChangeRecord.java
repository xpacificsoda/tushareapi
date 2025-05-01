package cn.initialfire.tushare.api.stock.responsedata;

import lombok.Data;

@Data
public class StockNameChangeRecord {

    // TS股票代码
    private String tsCode;

    // 股票名称
    private String name;

    // 公告开始日期
    private String startDate;

    // 公告结束日期
    private String endDate;

    // 变更前名称
    private String annDate;

    // 变更原因
    private String changeReason;
}
