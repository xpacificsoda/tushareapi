package cn.initialfire.tushare.api.stock.service;

import cn.initialfire.tushare.api.stock.requestdata.StockRangeRequestV3;
import cn.initialfire.tushare.api.stock.responsedata.StockShareHolderInfo;

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
    
}
