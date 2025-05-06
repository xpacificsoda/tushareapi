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
    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private Double preClose;
    private Double change;
    private Double pctChg;
    private Double vol;
    private Double amount;
}
