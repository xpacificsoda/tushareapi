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
import cn.initialfire.tushare.api.stock.responsedata.StockNameChangeRecord;
import cn.initialfire.tushare.api.stock.responsedata.StockTradeDateInfo;
import cn.initialfire.tushare.api.stock.requestdata.StockRangeRequestV6;
import cn.initialfire.tushare.api.stock.requestdata.StockRangeRequestV7;
import cn.initialfire.tushare.api.stock.requestdata.StockRangeRequestV8;
import cn.initialfire.tushare.api.stock.responsedata.StockIPOInfo;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

/**
 * 基础数据：https://tushare.pro/document/2?doc_id=24
 */
public class StockBasicDataService {

    /**
     * 股票列表接口：https://tushare.pro/document/2?doc_id=25
     * @param request
     * @return
     */
    public List<StockBasicInfo> queryStockList(QueryStockListRequest request) {
        return TushareHttp.instance().send("stock_basic", request, new TypeReference<List<StockBasicInfo>>() {});
    }

    /**
     * 交易日历接口：https://tushare.pro/document/2?doc_id=26
     * @param request
     * @return
     */
    public List<StockTradeDateInfo> queryStockTradeCalender(StockRangeRequestV8 request) {
        return TushareHttp.instance().send("trade_cal", request, new TypeReference<List<StockTradeDateInfo>>() {});
    }

    /**
     * 股票名称变更记录接口：https://tushare.pro/document/2?doc_id=100
     * @param request
     * @return
     */
    public List<StockNameChangeRecord> queryStockNameChangeRecordList(StockRangeRequestV6 request) {
        return TushareHttp.instance().send("namechange", request, new TypeReference<List<StockNameChangeRecord>>() {});
    }

    /**
     * 上市公司基本信息接口：https://tushare.pro/document/2?doc_id=112
     * @param request
     * @return
     */
    public List<StockCompanyInfo> queryStockCompanyInfoList(QueryStockInfoRequest request) {
        return TushareHttp.instance().send("stock_company", request, new TypeReference<List<StockCompanyInfo>>() {});
    }

    /**
     * 上市公司高管信息接口：https://tushare.pro/document/2?doc_id=193
     * @param request
     * @return
     */
    public List<StockManagerInfo> queryStockManagerInfoList(StockRangeRequestV2 request) {
        return TushareHttp.instance().send("stk_managers", request, new TypeReference<List<StockManagerInfo>>() {});
    }

    /**
     * 上市公司高管薪酬和持股信息接口：https://tushare.pro/document/2?doc_id=194
     * @param request
     * @return
     */
    public List<StockManagerRewardInfo> queryStockManagerRewardInfoList(StockEndDateRequest request) {
        return TushareHttp.instance().send("stk_rewards", request, new TypeReference<List<StockManagerRewardInfo>>() {});
    }

    /**
     * 新股发行接口：https://tushare.pro/document/2?doc_id=123
     * @param request
     * @return
     */
    public List<StockIPOInfo> queryStockIPOInfoList(StockRangeRequestV7 request) {
        return TushareHttp.instance().send("new_share", request, new TypeReference<List<StockIPOInfo>>() {});
    }
}
