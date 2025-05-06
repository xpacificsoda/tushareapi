package cn.initialfire.tushare.api.stock.responsedata;

import lombok.Data;

@Data
public class StockManagerRewardInfo {

    // TS股票代码
    private String tsCode;

    // 公告日期
    private String annDate;

    // 截止日期
    private String endDate;

    // 姓名
    private String name;

    // 职务
    private String title;

    // 奖励类型
    private Double reward;

    // 持股数
    private Double holdVol;
}
