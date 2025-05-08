package cn.initialfire.tushare.api.stock.requestdata;
import cn.initialfire.tushare.api.stock.commonvo.StockEnums;
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
public class StockRangeRequestV8 extends BaseRequestData {
    private StockEnums.Exchange exchange;
    private String startDate;
    private String endDate;
    private String isOpen;
}
