# Tushare API Java SDK
This is a Java SDK wrapper for the [Tushare](https://tushare.pro/) API. [Tushare](https://tushare.pro/) is a website that provides China stock market data. [中文版文档](./README.md)

## Basic Usage
```java
// Set token
TushareAPI.setToken("your Tushare token");

// Call the corresponding API
StockRangeRequest request = new StockRangeRequest();    
request.setTsCode("002027.SZ");
request.setTradeDate("20240926");

List<StockVolumePriceRecord> records = TushareAPI.Stock.TradeDataService.daily(request);
```

## Current Version (Initial Release) Includes the Following APIs
### Basic Data - StockBasicDataService
This class encapsulates APIs under [Basic Data](https://tushare.pro/document/2?doc_id=24).
| Class | Method | Description |
|--------------|--------|-------------|
| StockBasicDataService | queryStockList | [Stock List API](https://tushare.pro/document/2?doc_id=25) |
| StockBasicDataService | queryStockCompanyInfoList | [Listed Company Basic Information API](https://tushare.pro/document/2?doc_id=112) |
| StockBasicDataService | queryStockManagerInfoList | [Listed Company Executive Information API](https://tushare.pro/document/2?doc_id=193) |
| StockBasicDataService | queryStockManagerRewardInfoList | [Listed Company Executive Compensation and Shareholding Information API](https://tushare.pro/document/2?doc_id=194) |

### Market Data - StockTradeDataService
This class encapsulates APIs under [Market Data](https://tushare.pro/document/2?doc_id=15).
| Class | Method | Description |
|--------------|--------|-------------|
| StockTradeDataService | daily | [Daily K-line Data API](https://tushare.pro/document/2?doc_id=27) |
| StockTradeDataService | weekly | [Weekly K-line Data API](https://tushare.pro/document/2?doc_id=144) |
| StockTradeDataService | monthly | [Monthly K-line Data API](https://tushare.pro/document/2?doc_id=145) |
| StockTradeDataService | adjustmentFactor | [Adjustment Factor API](https://tushare.pro/document/2?doc_id=28) |

### Financial Data - StockFinanceDataService
This class encapsulates APIs under [Financial Data](https://tushare.pro/document/2?doc_id=16).
| Class | Method | Description |
|--------------|--------|-------------|
| StockFinanceDataService | incomeReport | [Income Statement API](https://tushare.pro/document/2?doc_id=33) |
| StockFinanceDataService | balanceSheetReport | [Balance Sheet API](https://tushare.pro/document/2?doc_id=36) |
| StockFinanceDataService | cashflowReport | [Cash Flow Statement API](https://tushare.pro/document/2?doc_id=44) | 