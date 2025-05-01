package cn.initialfire.tushare.api.stock.requestdata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QueryStockHolderTradeRequest {
    private String tsCode;
    private String annDate;
    private String startDate;
    private String endDate;
    private String holderType;
    private String tradeType;
}
