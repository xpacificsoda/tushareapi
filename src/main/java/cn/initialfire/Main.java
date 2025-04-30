package cn.initialfire;

import cn.initialfire.tushare.api.TushareAPI;
import cn.initialfire.tushare.api.stock.service.StockFinanceDataService;
import cn.initialfire.tushare.api.stock.requestdata.QueryStockDividendRequest;
import cn.initialfire.tushare.api.stock.responsedata.StockDividendRecord;
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

        String tsCode = "002027.SZ";

        StockFinanceDataService stockFinanceDataService = TushareAPI.Stock.FinanceDataService;

        QueryStockDividendRequest request1 = QueryStockDividendRequest.builder()
            .tsCode(tsCode)
            .build();
        List<StockDividendRecord> dividendRecords = stockFinanceDataService.queryDividendRecords(request1);
        System.out.println(dividendRecords);
    }
}
