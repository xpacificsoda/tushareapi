package cn.initialfire.tushare.api.stock.service;

import cn.initialfire.tushare.api.stock.requestdata.StockRangeRequest;
import cn.initialfire.tushare.api.stock.responsedata.StockVolumePriceRecord;
import cn.initialfire.tushare.api.stock.responsedata.StockAdjustmentFactorRecord;
import cn.initialfire.tushare.api.TushareHttp;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

/**
 * 行情数据：https://tushare.pro/document/2?doc_id=15
 */
public class StockTradeDataService {

    /**
     * 日K线数据接口：https://tushare.pro/document/2?doc_id=27
     * @param request
     * @return
     */
    public List<StockVolumePriceRecord> daily(StockRangeRequest request) {
        return tradeDataList(request, "daily");
    }

    /**
     * 周K线数据接口：https://tushare.pro/document/2?doc_id=144
     * @param request
     * @return
     */
    public List<StockVolumePriceRecord> weekly(StockRangeRequest request) {
        return tradeDataList(request, "weekly");
    }

    /**
     * 月K线数据接口：https://tushare.pro/document/2?doc_id=145
     * @param request
     * @return
     */
    public List<StockVolumePriceRecord> monthly(StockRangeRequest request) {
        return tradeDataList(request, "monthly");
    }

    /**
     * 复权因子接口：https://tushare.pro/document/2?doc_id=28
     * @param request
     * @return
     */
    public List<StockAdjustmentFactorRecord> adjustmentFactor(StockRangeRequest request) {
        return TushareHttp.instance().send("adj_factor", request, new TypeReference<List<StockAdjustmentFactorRecord>>() {});
    }

    private List<StockVolumePriceRecord> tradeDataList(StockRangeRequest request, String periodType) {
        return TushareHttp.instance().send(periodType, request, new TypeReference<List<StockVolumePriceRecord>>() {});
    }
}