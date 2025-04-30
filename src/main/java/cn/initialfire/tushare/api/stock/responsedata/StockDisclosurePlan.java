package cn.initialfire.tushare.api.stock.responsedata;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockDisclosurePlan {
    private String tsCode;
    private String annDate;
    private String endDate;
    private String preDate;
    private String actualDate;
    private String modifyDate;
}