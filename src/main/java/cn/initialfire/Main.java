package cn.initialfire;

import cn.initialfire.tushare.api.TushareAPI;
import cn.initialfire.tushare.api.stock.requestdata.StockRangeRequest;
import cn.initialfire.tushare.api.stock.responsedata.StockVolumePriceRecord;
import cn.initialfire.tushare.api.stock.service.StockTradeDataService;
import cn.initialfire.tushare.api.stock.responsedata.StockAdjustmentFactorRecord;
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

        StockTradeDataService tradeDataService = TushareAPI.Stock.TradeDataService;

        StockRangeRequest request = new StockRangeRequest();    
        request.setTsCode(tsCode);
        request.setTradeDate("20240926");

        List<StockVolumePriceRecord> records = tradeDataService.daily(request);
        System.out.println(records);

        List<StockAdjustmentFactorRecord> adjustmentFactorRecords = tradeDataService.adjustmentFactor(request);
        System.out.println(adjustmentFactorRecords);
        
    }
}
