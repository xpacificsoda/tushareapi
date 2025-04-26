package cn.initialfire.tushare.api.stock.requestdata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockRangeRequest {

    private String tsCode;
    private String tradeDate;
    private String startDate;
    private String endDate;
}
