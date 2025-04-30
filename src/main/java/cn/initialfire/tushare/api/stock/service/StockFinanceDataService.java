package cn.initialfire.tushare.api.stock.service;

import cn.initialfire.tushare.api.stock.requestdata.QueryStockDividendRequest;
import cn.initialfire.tushare.api.stock.requestdata.QueryStockReportRequest;
import cn.initialfire.tushare.api.stock.requestdata.StockRangeRequestV3;
import cn.initialfire.tushare.api.stock.requestdata.StockRangeRequestV4;
import cn.initialfire.tushare.api.stock.requestdata.QueryStockDisclosureRequest;
import cn.initialfire.tushare.api.stock.responsedata.StockIncomeReport;
import cn.initialfire.tushare.api.stock.responsedata.StockBalanceSheetReport;
import cn.initialfire.tushare.api.stock.responsedata.StockCashflowReport;
import cn.initialfire.tushare.api.stock.responsedata.StockDividendRecord;
import cn.initialfire.tushare.api.stock.responsedata.StockFinanceIndicators;
import cn.initialfire.tushare.api.stock.responsedata.StockFinanceAuditRecord;
import cn.initialfire.tushare.api.stock.responsedata.StockMainBizItem;
import cn.initialfire.tushare.api.stock.responsedata.StockDisclosurePlan;


import com.fasterxml.jackson.core.type.TypeReference;
import cn.initialfire.tushare.api.TushareHttp;
import java.util.List;

/**
 * 财务数据：https://tushare.pro/document/2?doc_id=16
 */
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

    /*
     * 分红送股数据接口：https://tushare.pro/document/2?doc_id=103
     */
    public List<StockDividendRecord> queryDividendRecords(QueryStockDividendRequest request) {
        return TushareHttp.instance().send("dividend", request, new TypeReference<List<StockDividendRecord>>() {});
    }

    /**
     * 财务指标接口：https://tushare.pro/document/2?doc_id=79
     * @param request
     * @return
     */
    public List<StockFinanceIndicators> queryFinanceIndicators(StockRangeRequestV3 request) {
        return TushareHttp.instance().send("fina_indicator", request, new TypeReference<List<StockFinanceIndicators>>() {});
    }

    /**
     * 财务审计接口：https://tushare.pro/document/2?doc_id=80
     * @param request
     * @return
     */
    public List<StockFinanceAuditRecord> queryFinanceAudit(StockRangeRequestV3 request) {
        return TushareHttp.instance().send("fina_audit", request, new TypeReference<List<StockFinanceAuditRecord>>() {});
    }

    /**
     * 主营业务收入构成接口：https://tushare.pro/document/2?doc_id=81
     * @param request
     * @return
     */
    public List<StockMainBizItem> queryMainBizIncome(StockRangeRequestV4 request) {
        return TushareHttp.instance().send("fina_mainbz", request, new TypeReference<List<StockMainBizItem>>() {});
    }

    /**
     * 披露计划接口：https://tushare.pro/document/2?doc_id=162
     * @param request
     * @return
     */
    public List<StockDisclosurePlan> queryDisclosurePlan(QueryStockDisclosureRequest request) {
        return TushareHttp.instance().send("disclosure_date", request, new TypeReference<List<StockDisclosurePlan>>() {});
    }
}