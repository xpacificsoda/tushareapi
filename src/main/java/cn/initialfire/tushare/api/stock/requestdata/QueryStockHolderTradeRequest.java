package cn.initialfire.tushare.api.stock.requestdata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class QueryStockHolderTradeRequest extends BaseRequestData {
    private String tsCode;
    private String annDate;
    private String startDate;
    private String endDate;
    private String holderType;
    private String tradeType;
}
