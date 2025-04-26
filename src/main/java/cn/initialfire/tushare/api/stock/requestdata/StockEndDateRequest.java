package cn.initialfire.tushare.api.stock.requestdata;

import lombok.Data;

@Data
public class StockEndDateRequest {

    // 股票代码
    private String tsCode;

    // 公告日期
    private String endDate;

}
