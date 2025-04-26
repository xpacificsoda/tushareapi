package cn.initialfire.tushare.api.stock.service;

import cn.initialfire.tushare.api.stock.requestdata.QueryStockListRequest;
import cn.initialfire.tushare.api.stock.requestdata.StockEndDateRequest;
import cn.initialfire.tushare.api.stock.responsedata.StockBasicInfo;
import cn.initialfire.tushare.api.TushareHttp;
import cn.initialfire.tushare.api.stock.requestdata.QueryStockInfoRequest;
import cn.initialfire.tushare.api.stock.responsedata.StockCompanyInfo;
import cn.initialfire.tushare.api.stock.requestdata.StockRangeRequestV2;
import cn.initialfire.tushare.api.stock.responsedata.StockManagerRewardInfo;
import cn.initialfire.tushare.api.stock.responsedata.StockManagerInfo;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class StockBasicDataService {

    public List<StockBasicInfo> queryStockList(QueryStockListRequest request) {
        return TushareHttp.instance().send("stock_basic", request, new TypeReference<List<StockBasicInfo>>() {});
    }

    public List<StockCompanyInfo> queryStockCompanyInfoList(QueryStockInfoRequest request) {
        return TushareHttp.instance().send("stock_company", request, new TypeReference<List<StockCompanyInfo>>() {});
    }

    public List<StockManagerInfo> queryStockManagerInfoList(StockRangeRequestV2 request) {
        return TushareHttp.instance().send("stk_managers", request, new TypeReference<List<StockManagerInfo>>() {});
    }

    public List<StockManagerRewardInfo> queryStockManagerRewardInfoList(StockEndDateRequest request) {
        return TushareHttp.instance().send("stk_rewards", request, new TypeReference<List<StockManagerRewardInfo>>() {});
    }
}
