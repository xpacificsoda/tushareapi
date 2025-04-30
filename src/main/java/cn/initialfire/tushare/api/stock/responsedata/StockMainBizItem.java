package cn.initialfire.tushare.api.stock.responsedata;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockMainBizItem {
    private String tsCode;
    private String endDate;
    private String bzItem;
    private Double bzSales;
    private Double bzProfit;
    private Double bzCost;
    private String currType;
    private String updateFlag;
}
