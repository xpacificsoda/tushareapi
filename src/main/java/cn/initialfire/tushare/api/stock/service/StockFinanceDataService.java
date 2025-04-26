package cn.initialfire.tushare.api.stock.service;

import cn.initialfire.tushare.api.stock.requestdata.QueryStockReportRequest;
import cn.initialfire.tushare.api.stock.responsedata.StockIncomeReport;
import cn.initialfire.tushare.api.stock.responsedata.StockBalanceSheetReport;
import cn.initialfire.tushare.api.stock.responsedata.StockCashflowReport;
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

    /**
     * 资产负债表接口：https://tushare.pro/document/2?doc_id=36
     * @param request
     * @return
     */
    public List<StockBalanceSheetReport> balanceSheetReport(QueryStockReportRequest request) {
        return TushareHttp.instance().send("balancesheet", request, new TypeReference<List<StockBalanceSheetReport>>() {});
    }

    /**
     * 现金流量表接口：https://tushare.pro/document/2?doc_id=44
     * @param request
     * @return
     */
    public List<StockCashflowReport> cashflowReport(QueryStockReportRequest request) {
        return TushareHttp.instance().send("cashflow", request, new TypeReference<List<StockCashflowReport>>() {});
    }
}
