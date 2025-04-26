package cn.initialfire.tushare.api;

import cn.initialfire.tushare.api.stock.service.StockTradeDataService;

public class TushareAPI {
    public static void setToken(String token) {
        TushareHttp.instance().setToken(token);
    }

    public static class Stock {
        public static final StockTradeDataService TradeDataService = new StockTradeDataService();
    }
}
