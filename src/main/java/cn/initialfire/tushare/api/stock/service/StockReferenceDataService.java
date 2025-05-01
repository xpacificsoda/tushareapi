package cn.initialfire.tushare.api.stock.service;

import cn.initialfire.tushare.api.stock.requestdata.StockRangeRequestV3;
import cn.initialfire.tushare.api.stock.responsedata.StockPledgeStat;
import cn.initialfire.tushare.api.stock.responsedata.StockShareHolderInfo;
import cn.initialfire.tushare.api.stock.requestdata.StockEndDateRequest;
import cn.initialfire.tushare.api.stock.requestdata.StockRequest;
import cn.initialfire.tushare.api.stock.responsedata.StockPledgeDetail; 
import cn.initialfire.tushare.api.stock.responsedata.StockHolderTradeRecord;
import cn.initialfire.tushare.api.stock.requestdata.QueryStockHolderTradeRequest;
import cn.initialfire.tushare.api.stock.responsedata.StockRepurchaseRecord;
import cn.initialfire.tushare.api.stock.requestdata.StockRangeRequestV5;

import cn.initialfire.tushare.api.TushareHttp;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;

public class StockReferenceDataService {
    /*
     * 获取前十大股东: https://tushare.pro/document/2?doc_id=61
     */
    public List<StockShareHolderInfo> topTenHolders(StockRangeRequestV3 request) {
        return TushareHttp.instance().send("top10_holders", request, new TypeReference<List<StockShareHolderInfo>>() {});
    }

    /*
     * 前十大流通股东: https://tushare.pro/document/2?doc_id=62
     */
    public List<StockShareHolderInfo> topTenFloatHolders(StockRangeRequestV3 request) {
        return TushareHttp.instance().send("top10_floatholders", request, new TypeReference<List<StockShareHolderInfo>>() {});
    }

    /*
     * 质押统计: https://tushare.pro/document/2?doc_id=110
     */
    public List<StockPledgeStat> queryStockPledgeStat(StockEndDateRequest request) {
        return TushareHttp.instance().send("pledge_stat", request, new TypeReference<List<StockPledgeStat>>() {});
    }

    /*
     * 质押明细: https://tushare.pro/document/2?doc_id=111
     */
    public List<StockPledgeDetail> queryStockPledgeDetail(StockRequest request) {
        return TushareHttp.instance().send("pledge_detail", request, new TypeReference<List<StockPledgeDetail>>() {});
    }

    /*
     * 股票回购历史: https://tushare.pro/document/2?doc_id=124
     */
    public List<StockRepurchaseRecord> queryStockRepurchaseHistory(StockRangeRequestV5 request) {
        return TushareHttp.instance().send("repurchase", request, new TypeReference<List<StockRepurchaseRecord>>() {});
    }

    /*
     * 股东增减持变动: https://tushare.pro/document/2?doc_id=175
     */
    public List<StockHolderTradeRecord> queryStockHolderTrade(QueryStockHolderTradeRequest request) {
        return TushareHttp.instance().send("stk_holdertrade", request, new TypeReference<List<StockHolderTradeRecord>>() {});
    }
}
