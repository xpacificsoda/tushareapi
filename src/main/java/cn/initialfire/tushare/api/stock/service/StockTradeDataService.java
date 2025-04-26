package cn.initialfire.tushare.api.stock.service;

import cn.initialfire.tushare.api.stock.requestdata.StockRangeRequest;
import cn.initialfire.tushare.api.stock.responsedata.StockVolumePriceRecord;
import cn.initialfire.tushare.api.stock.responsedata.StockAdjustmentFactorRecord;
import cn.initialfire.tushare.api.TushareHttp;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class StockTradeDataService {

    public List<StockVolumePriceRecord> daily(StockRangeRequest request) {
        return tradeDataList(request, "daily");
    }

    public List<StockVolumePriceRecord> weekly(StockRangeRequest request) {
        return tradeDataList(request, "weekly");
    }

    public List<StockVolumePriceRecord> monthly(StockRangeRequest request) {
        return tradeDataList(request, "monthly");
    }

    public List<StockAdjustmentFactorRecord> adjustmentFactor(StockRangeRequest request) {
        return TushareHttp.instance().send("adj_factor", request, new TypeReference<List<StockAdjustmentFactorRecord>>() {});
    }

    private List<StockVolumePriceRecord> tradeDataList(StockRangeRequest request, String periodType) {
        return TushareHttp.instance().send(periodType, request, new TypeReference<List<StockVolumePriceRecord>>() {});
    }
}