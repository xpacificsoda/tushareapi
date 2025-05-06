package cn.initialfire.tushare.api.stock.responsedata;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockAdjustmentFactorRecord {
    private String tsCode;
    private String tradeDate;
    private Double adjFactor;
}
