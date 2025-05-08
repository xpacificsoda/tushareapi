package cn.initialfire;

import cn.initialfire.tushare.api.TushareAPI;
import cn.initialfire.tushare.api.stock.requestdata.StockRangeRequest;
import cn.initialfire.tushare.api.stock.requestdata.StockRangeRequestV8;
import cn.initialfire.tushare.api.stock.responsedata.StockTradeDateInfo;
import cn.initialfire.tushare.api.stock.commonvo.StockEnums;
import cn.initialfire.tushare.api.stock.responsedata.StockBasicMetric;
import java.util.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        // Load token from config file
        Properties config = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            config.load(fis);
            TushareAPI.setToken(config.getProperty("tushare.token"));
        } catch (IOException e) {
            System.err.println("Failed to load config.properties. Please create this file with your Tushare token.");
            System.err.println("Example config.properties content:");
            System.exit(1);
        }
        
        StockRangeRequestV8 request = StockRangeRequestV8.builder()
            .exchange(StockEnums.Exchange.SSE)
            .isOpen("1")
            .build();
        List<StockTradeDateInfo> list = TushareAPI.Stock.BasicDataService.queryStockTradeCalender(request);
        System.out.println(list);

        List<StockBasicMetric> list2 = TushareAPI.Stock.TradeDataService.dailyBasicMetricList(StockRangeRequest.builder()
                .tsCode("002027.sz")
                .tradeDate("")
                .startDate("20250501")
                .endDate("20250508")
                .build());
        System.out.println(list2);
    }
}
