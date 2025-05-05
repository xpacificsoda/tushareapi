package cn.initialfire.tushare.api.stock.responsedata;

import lombok.Data;

@Data
public class StockIPOInfo {
    private String tsCode;        // TS代码
    private String subCode;       // 申购代码
    private String name;          // 名称
    private String ipoDate;       // 上网发行日期
    private String issueDate;     // 上市日期
    private Double amount;        // 发行总量（万股）
    private Double marketAmount;  // 上网发行总量（万股）
    private Double price;         // 发行价格
    private Double pe;       // 市盈率
    private Double limitAmount;   // 个人申购上限（万股）
    private Double funds;         // 募集资金（亿元）
    private Double ballot;        // 中签率
}
