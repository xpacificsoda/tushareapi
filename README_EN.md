# Tushare API Java SDK
This is a Java SDK wrapper for the [Tushare](https://tushare.pro/) API. [Tushare](https://tushare.pro/) is a website that provides China stock market data. [中文版文档](./README.md)

## Basic Usage
```java
// Set token
TushareAPI.setToken("your Tushare token");

// Call the corresponding API
StockRangeRequest request = StockRangeRequest.builder()
    .tsCode("002027.SZ")
    .tradeDate("20240926")
    .build();

List<StockVolumePriceRecord> records = TushareAPI.Stock.TradeDataService.daily(request);
```

## Current Version (Initial Release) Includes the Following APIs
### Basic Data - TushareAPI.Stock.BasicDataService
This class encapsulates APIs under [Basic Data](https://tushare.pro/document/2?doc_id=24).
| Object | Method | Description |
|--------------|--------|-------------|
| TushareAPI.Stock.BasicDataService | queryStockList | [Stock List API](https://tushare.pro/document/2?doc_id=25) |
| TushareAPI.Stock.BasicDataService | queryStockNameChangeRecordList | [Stock Name Change Records API](https://tushare.pro/document/2?doc_id=100) |
| TushareAPI.Stock.BasicDataService | queryStockCompanyInfoList | [Listed Company Basic Information API](https://tushare.pro/document/2?doc_id=112) |
| TushareAPI.Stock.BasicDataService | queryStockManagerInfoList | [Listed Company Executive Information API](https://tushare.pro/document/2?doc_id=193) |
| TushareAPI.Stock.BasicDataService | queryStockManagerRewardInfoList | [Listed Company Executive Compensation and Shareholding Information API](https://tushare.pro/document/2?doc_id=194) |

### Market Data - TushareAPI.Stock.TradeDataService
This class encapsulates APIs under [Market Data](https://tushare.pro/document/2?doc_id=15).
| Object | Method | Description |
|--------------|--------|-------------|
| TushareAPI.Stock.TradeDataService | daily | [Daily K-line Data API](https://tushare.pro/document/2?doc_id=27) |
| TushareAPI.Stock.TradeDataService | weekly | [Weekly K-line Data API](https://tushare.pro/document/2?doc_id=144) |
| TushareAPI.Stock.TradeDataService | monthly | [Monthly K-line Data API](https://tushare.pro/document/2?doc_id=145) |
| TushareAPI.Stock.TradeDataService | adjustmentFactor | [Adjustment Factor API](https://tushare.pro/document/2?doc_id=28) |

### Financial Data - TushareAPI.Stock.FinanceDataService
This class encapsulates APIs under [Financial Data](https://tushare.pro/document/2?doc_id=16).
| Object | Method | Description |
|--------------|--------|-------------|
| TushareAPI.Stock.FinanceDataService | incomeReport | [Income Statement API](https://tushare.pro/document/2?doc_id=33) |
| TushareAPI.Stock.FinanceDataService | balanceSheetReport | [Balance Sheet API](https://tushare.pro/document/2?doc_id=36) |
| TushareAPI.Stock.FinanceDataService | cashflowReport | [Cash Flow Statement API](https://tushare.pro/document/2?doc_id=44) |
| TushareAPI.Stock.FinanceDataService | queryDividendRecords | [Dividend and Stock Split Data API](https://tushare.pro/document/2?doc_id=103) |
| TushareAPI.Stock.FinanceDataService | queryFinanceIndicators | [Financial Indicators API](https://tushare.pro/document/2?doc_id=79) |
| TushareAPI.Stock.FinanceDataService | queryFinanceAudit | [Financial Audit API](https://tushare.pro/document/2?doc_id=80) |
| TushareAPI.Stock.FinanceDataService | queryMainBizIncome | [Main Business Income Composition API](https://tushare.pro/document/2?doc_id=81) |
| TushareAPI.Stock.FinanceDataService | queryDisclosurePlan | [Disclosure Plan API](https://tushare.pro/document/2?doc_id=162) |

### Market Reference Data - TushareAPI.Stock.ReferenceDataService
This class encapsulates APIs under [Market Reference Data](https://tushare.pro/document/2?doc_id=17).
| Object | Method | Description |
|--------------|--------|-------------|
| TushareAPI.Stock.ReferenceDataService | topTenHolders | [Top 10 Shareholders API](https://tushare.pro/document/2?doc_id=61) |
| TushareAPI.Stock.ReferenceDataService | topTenFloatHolders | [Top 10 Floating Shareholders API](https://tushare.pro/document/2?doc_id=62) |
| TushareAPI.Stock.ReferenceDataService | queryStockPledgeStat | [Pledge Statistics API](https://tushare.pro/document/2?doc_id=110) |
| TushareAPI.Stock.ReferenceDataService | queryStockPledgeDetail | [Pledge Details API](https://tushare.pro/document/2?doc_id=111) |
| TushareAPI.Stock.ReferenceDataService | queryStockRepurchaseHistory | [Stock Repurchase History API](https://tushare.pro/document/2?doc_id=124) |
| TushareAPI.Stock.ReferenceDataService | queryStockHolderTrade | [Shareholder Trading Changes API](https://tushare.pro/document/2?doc_id=175) |
