# Tushare API Java SDK
这是一个对 [Tushare](https://tushare.pro/) 的 API 封装的 Java SDK。[Tushare](https://tushare.pro/) 是一个提供 A 股数据的网站。[English Version](./README_EN.md)

## 基本用法
```java
// 设置 token
TushareAPI.setToken("your Tushare token");

// 调用对应的 API
StockRangeRequest request = StockRangeRequest.builder()
    .tsCode("002027.SZ")
    .tradeDate("20240926")
    .build();

List<StockVolumePriceRecord> records = TushareAPI.Stock.TradeDataService.daily(request);
```

## 目前为初始版本，仅包含以下 API
### 基础数据 - TushareAPI.Stock.BasicDataService
这个类封装了 [基础数据](https://tushare.pro/document/2?doc_id=24) 下的 API。
| 对象 | 方法 | 作用 |
|--------------|--------|-------------|
| TushareAPI.Stock.BasicDataService | queryStockList | [股票列表接口](https://tushare.pro/document/2?doc_id=25) |
| TushareAPI.Stock.BasicDataService | queryStockNameChangeRecordList | [股票名称变更记录接口](https://tushare.pro/document/2?doc_id=100) |
| TushareAPI.Stock.BasicDataService | queryStockCompanyInfoList | [上市公司基本信息接口](https://tushare.pro/document/2?doc_id=112) |
| TushareAPI.Stock.BasicDataService | queryStockManagerInfoList | [上市公司高管信息接口](https://tushare.pro/document/2?doc_id=193) |
| TushareAPI.Stock.BasicDataService | queryStockManagerRewardInfoList | [上市公司高管薪酬和持股信息接](https://tushare.pro/document/2?doc_id=194) |

### 行情数据 - TushareAPI.Stock.TradeDataService
这个类封装了 [行情数据](https://tushare.pro/document/2?doc_id=15) 下的 API。
| 对象 | 方法 | 作用 |
|--------------|--------|-------------|
| TushareAPI.Stock.TradeDataService | daily | [日K线数据接口](https://tushare.pro/document/2?doc_id=27) |
| TushareAPI.Stock.TradeDataService | weekly | [周K线数据接口](https://tushare.pro/document/2?doc_id=144) |
| TushareAPI.Stock.TradeDataService | monthly | [月K线数据接口](https://tushare.pro/document/2?doc_id=145) |
| TushareAPI.Stock.TradeDataService | adjustmentFactor | [复权因子接口](https://tushare.pro/document/2?doc_id=28) |

### 财务数据 - TushareAPI.Stock.FinanceDataService
这个类封装了 [财务数据](https://tushare.pro/document/2?doc_id=16) 下的 API。
| 对象 | 方法 | 作用 |
|--------------|--------|-------------|
| TushareAPI.Stock.FinanceDataService | incomeReport | [利润表接口](https://tushare.pro/document/2?doc_id=33) |
| TushareAPI.Stock.FinanceDataService | balanceSheetReport | [资产负债表接口](https://tushare.pro/document/2?doc_id=36) |
| TushareAPI.Stock.FinanceDataService | cashflowReport | [现金流量表接口](https://tushare.pro/document/2?doc_id=44) |
| TushareAPI.Stock.FinanceDataService | queryDividendRecords | [分红送股数据接口](https://tushare.pro/document/2?doc_id=103) |
| TushareAPI.Stock.FinanceDataService | queryFinanceIndicators | [财务指标接口](https://tushare.pro/document/2?doc_id=79) |
| TushareAPI.Stock.FinanceDataService | queryFinanceAudit | [财务审计接口](https://tushare.pro/document/2?doc_id=80) |
| TushareAPI.Stock.FinanceDataService | queryMainBizIncome | [主营业务收入构成接口](https://tushare.pro/document/2?doc_id=81) |
| TushareAPI.Stock.FinanceDataService | queryDisclosurePlan | [披露计划接口](https://tushare.pro/document/2?doc_id=162) |

### 市场参考数据 - TushareAPI.Stock.ReferenceDataService
这个类封装了 [市场参考数据](https://tushare.pro/document/2?doc_id=17) 下的 API。
| 对象 | 方法 | 作用 |
|--------------|--------|-------------|
| TushareAPI.Stock.ReferenceDataService | topTenHolders | [前十大股东接口](https://tushare.pro/document/2?doc_id=61) |
| TushareAPI.Stock.ReferenceDataService | topTenFloatHolders | [前十大流通股东接口](https://tushare.pro/document/2?doc_id=62) |
| TushareAPI.Stock.ReferenceDataService | queryStockPledgeStat | [质押统计接口](https://tushare.pro/document/2?doc_id=110) |
| TushareAPI.Stock.ReferenceDataService | queryStockPledgeDetail | [质押明细接口](https://tushare.pro/document/2?doc_id=111) |
| TushareAPI.Stock.ReferenceDataService | queryStockRepurchaseHistory | [股票回购历史接口](https://tushare.pro/document/2?doc_id=124) |
| TushareAPI.Stock.ReferenceDataService | queryStockHolderTrade | [股东增减持变动接口](https://tushare.pro/document/2?doc_id=175) |