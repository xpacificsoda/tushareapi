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
public class StockRangeRequestV4 extends BaseRequestData {
    private String tsCode;
    private String period;
    private String type;
    private String startDate;
    private String endDate;
}