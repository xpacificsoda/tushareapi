package cn.initialfire.tushare.api.stock.responsedata;

import lombok.Data;

@Data
public class StockManagerInfo {
    // TS股票代码
    private String tsCode;

    // 公告日期
    private String annDate;

    // 姓名
    private String name;

    // 性别
    private String gender;

    // 岗位类别
    private String lev;

    // 职务
    private String title;

    // 学历
    private String edu;

    // 国籍
    private String national;

    // 出生年份
    private String birthday;

    // 任职日期
    private String beginDate;

    // 离职日期
    private String endDate;

    // 简历
    private String resume;

}
