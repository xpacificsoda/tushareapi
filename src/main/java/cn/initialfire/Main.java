package cn.initialfire;

import cn.initialfire.tushare.api.TushareAPI;
import cn.initialfire.tushare.api.stock.requestdata.QueryStockListRequest;
import cn.initialfire.tushare.api.stock.requestdata.StockRangeRequestV2;
import cn.initialfire.tushare.api.stock.responsedata.StockBasicInfo;
import cn.initialfire.tushare.api.stock.responsedata.StockManagerInfo;

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
        
        StockRangeRequestV2 request = StockRangeRequestV2.builder().build();
        int total = 0;
        int prevCount = 0;
        List<StockManagerInfo> list = null;
        do {
            prevCount = list == null ? 0 : list.size();
            total += prevCount;
            request.setOffset(total);
            
            list = TushareAPI.Stock.BasicDataService.queryStockManagerInfoList(request);
            if (list.size() == 0) {
                break;
            }

            StockManagerInfo stockManagerInfo = list.get(0);
            System.out.println("First MGR: " + stockManagerInfo.getTsCode() + " " + stockManagerInfo.getName());

            System.out.println("Count: " + prevCount + " -> " + list.size());
        } while (prevCount <= list.size());
        System.out.println("Total: " + total);
    }
}
