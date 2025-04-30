package cn.initialfire.tushare.api.stock.requestdata;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockRangeRequestV3 {
    private String tsCode;
    private String annDate;
    private String startDate;
    private String endDate;
    private String period;
}
