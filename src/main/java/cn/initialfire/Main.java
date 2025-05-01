package cn.initialfire;

import cn.initialfire.tushare.api.TushareAPI;
import cn.initialfire.tushare.api.stock.requestdata.StockRangeRequestV3;
import cn.initialfire.tushare.api.stock.responsedata.StockShareHolderInfo;
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
        String startDate = "20240101";
        String endDate = "20241231";

        StockRangeRequestV3 request = StockRangeRequestV3.builder()
            .tsCode(tsCode)
            .startDate(startDate)
            .endDate(endDate)
            .build();

        List<StockShareHolderInfo> topTenHolders = TushareAPI.Stock.ReferenceDataService.topTenHolders(request);
        System.out.println(topTenHolders);

        List<StockShareHolderInfo> topTenFloatHolders = TushareAPI.Stock.ReferenceDataService.topTenFloatHolders(request);
        System.out.println(topTenFloatHolders);
    }
}
