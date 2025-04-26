package cn.initialfire.tushare.api.stock.service;

import cn.initialfire.tushare.api.stock.requestdata.QueryStockListRequest;
import cn.initialfire.tushare.api.stock.responsedata.StockBasicInfo;
import cn.initialfire.tushare.api.TushareHttp;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class StockBasicDataService {

    public List<StockBasicInfo> queryStockList(QueryStockListRequest request) {
        return TushareHttp.instance().send("stock_basic", request, new TypeReference<List<StockBasicInfo>>() {});
    }
}
