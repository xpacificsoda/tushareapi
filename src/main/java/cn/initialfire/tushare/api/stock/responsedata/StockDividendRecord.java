package cn.initialfire.tushare.api.stock.responsedata;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockDividendRecord {
    private String tsCode;
    private String endDate;
    private String annDate;
    private String divProc;
    private Float stkDiv;
    private Float stkBoRate;
    private Float stkCoRate;
    private Float cashDiv;
    private Float cashDivTax;
    private String recordDate;
    private String exDate;
    private String payDate;
    private String divListdate;
    private String impAnnDate;
    private String baseDate;
    private Float baseShare;
    
}
