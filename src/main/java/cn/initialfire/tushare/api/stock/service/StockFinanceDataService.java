package cn.initialfire.tushare.api.stock.service;

import cn.initialfire.tushare.api.stock.requestdata.QueryStockReportRequest;
import cn.initialfire.tushare.api.stock.responsedata.StockIncomeReport;
import com.fasterxml.jackson.core.type.TypeReference;
import cn.initialfire.tushare.api.TushareHttp;
import java.util.List;

public class StockFinanceDataService {

    /**
     * 利润表接口：https://tushare.pro/document/2?doc_id=33
     * @param request
     * @return
     */
    public List<StockIncomeReport> incomeReport(QueryStockReportRequest request) {
        return TushareHttp.instance().send("income", request, new TypeReference<List<StockIncomeReport>>() {});
    }
}
