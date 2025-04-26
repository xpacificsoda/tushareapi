package cn.initialfire.tushare.api.stock.responsedata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockVolumePriceRecord {

    private String tsCode;
    private String tradeDate;
    private float open;
    private float high;
    private float low;
    private float close;
    private float preClose;
    private float change;
    private float pctChg;
    private float vol;
    private float amount;
}
