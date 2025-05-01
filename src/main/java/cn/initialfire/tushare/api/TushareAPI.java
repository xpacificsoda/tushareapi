package cn.initialfire.tushare.api;

import cn.initialfire.tushare.api.stock.service.StockBasicDataService;
import cn.initialfire.tushare.api.stock.service.StockTradeDataService;
import cn.initialfire.tushare.api.stock.service.StockFinanceDataService;
import cn.initialfire.tushare.api.stock.service.StockReferenceDataService;
public class TushareAPI {
    public static void setToken(String token) {
        TushareHttp.instance().setToken(token);
    }

    public static class Stock {
        public static final StockBasicDataService BasicDataService = new StockBasicDataService();
        public static final StockTradeDataService TradeDataService = new StockTradeDataService();
        public static final StockFinanceDataService FinanceDataService = new StockFinanceDataService();
        public static final StockReferenceDataService ReferenceDataService = new StockReferenceDataService();
    }
}
