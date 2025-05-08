package cn.initialfire.tushare.api.stock.responsedata;

import cn.initialfire.tushare.api.stock.commonvo.StockEnums;
import lombok.Data;

@Data
public class StockTradeDateInfo {
    private StockEnums.Exchange exchange;
    private String calDate;
    private String isOpen;
    private String pretradeDate;
}
