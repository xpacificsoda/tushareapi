package cn.initialfire.tushare.api.stock.requestdata;

import lombok.Data;

@Data
public class QueryStockInfoRequest {
    private String tsCode;
    private String exchange;
}
