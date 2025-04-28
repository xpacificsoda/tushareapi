# Tushare API Java SDK
这是一个对 [Tushare](https://tushare.pro/) 的 API 封装的 Java SDK。

## 基本用法
`
// 设置 token
TushareAPI.setToken("your Tushare token");

// 调用对应的 API
StockRangeRequest request = new StockRangeRequest();    
request.setTsCode(tsCode);
request.setTradeDate("20240926");

List<StockVolumePriceRecord> records = TushareAPI.Stock.TradeDataService.daily(request);
`

## 目前为初始版本，仅包含以下 API
### 基础数据 StockBasicDataService
这个类封装了 [基础数据](https://tushare.pro/document/2?doc_id=24) 下的 API。
| 类 | 方法 | 作用 |
|--------------|--------|-------------|
| StockBasicDataService | queryStockList | [股票列表接口](https://tushare.pro/document/2?doc_id=25) |
| StockBasicDataService | queryStockCompanyInfoList | [上市公司基本信息接口](https://tushare.pro/document/2?doc_id=112) |
| StockBasicDataService | queryStockManagerInfoList | [上市公司高管信息接口](https://tushare.pro/document/2?doc_id=193) |
| StockBasicDataService | queryStockManagerRewardInfoList | [上市公司高管薪酬和持股信息接](https://tushare.pro/document/2?doc_id=194) |

### 行情数据 StockTradeDataService
这个类封装了 [行情数据](https://tushare.pro/document/2?doc_id=15) 下的 API。
| 类 | 方法 | 作用 |
| StockTradeDataService | daily | [日K线数据接口](https://tushare.pro/document/2?doc_id=27) |
| StockTradeDataService | weekly | [周K线数据接口](https://tushare.pro/document/2?doc_id=144) |
| StockTradeDataService | monthly | [月K线数据接口](https://tushare.pro/document/2?doc_id=145) |
| StockTradeDataService | adjustmentFactor | [复权因子接口](https://tushare.pro/document/2?doc_id=28) |

### 财务数据 StockFinanceDataService
这个类封装了 [财务数据](https://tushare.pro/document/2?doc_id=16) 下的 API。
| 类 | 方法 | 作用 |
| StockFinanceDataService | incomeReport | [利润表接口](https://tushare.pro/document/2?doc_id=33) |
| StockFinanceDataService | balanceSheetReport | [资产负债表接口](https://tushare.pro/document/2?doc_id=36) |
| StockFinanceDataService | cashflowReport | [现金流量表接口](https://tushare.pro/document/2?doc_id=44) |
