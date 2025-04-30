package cn.initialfire.tushare.api.stock.requestdata;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockRangeRequestV4 {
    private String tsCode;
    private String period;
    private String type;
    private String startDate;
    private String endDate;
}