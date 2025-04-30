package cn.initialfire.tushare.api.stock.requestdata;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QueryStockDividendRequest {
    private String tsCode;
    private String annDate;
    private String recordDate;
    private String exDate;
    private String impAnnDate;    
}
