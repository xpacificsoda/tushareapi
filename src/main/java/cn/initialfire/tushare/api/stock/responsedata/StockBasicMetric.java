package cn.initialfire.tushare.api.stock.responsedata;

import lombok.Data;

@Data
public class StockBasicMetric {
    private Long id;
    private String tsCode;
    private String tradeDate;
    private Double close;
    private Double turnoverRate;
    private Double turnoverRateF;
    private Double volumeRatio;
    private Double pe;
    private Double peTtm;
    private Double pb;
    private Double ps;
    private Double psTtm;
    private Double dvRatio;
    private Double dvTtm;
    private Double totalShare;
    private Double floatShare;
    private Double freeShare;
    private Double totalMv;
    private Double circMv;
}
