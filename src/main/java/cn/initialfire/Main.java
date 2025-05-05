package cn.initialfire;

import cn.initialfire.tushare.api.TushareAPI;
import cn.initialfire.tushare.api.stock.requestdata.StockRangeRequestV7;
import cn.initialfire.tushare.api.stock.responsedata.StockIPOInfo;

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

        StockRangeRequestV7 request = StockRangeRequestV7.builder()
                .startDate("20250101")
                .endDate("20250505")
                .build();
        
        List<StockIPOInfo> stockIPOInfoList = TushareAPI.Stock.BasicDataService
                .queryStockIPOInfoList(request);
        System.out.println(stockIPOInfoList);
    }
}
