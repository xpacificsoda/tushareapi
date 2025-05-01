package cn.initialfire.tushare.api.stock.requestdata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockRangeRequestV5 {
    private String annDate;
    private String startDate;
    private String endDate;
}
