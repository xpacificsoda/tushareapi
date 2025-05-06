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
public class StockEndDateRequest extends BaseRequestData {

    // 股票代码
    private String tsCode;

    // 公告日期
    private String endDate;

}
