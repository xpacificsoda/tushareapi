package cn.initialfire.tushare.api.stock.requestdata;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class QueryStockDividendRequest extends BaseRequestData {
    private String tsCode;
    private String annDate;
    private String recordDate;
    private String exDate;
    private String impAnnDate;    
}
