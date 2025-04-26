package cn.initialfire.tushare.api.stock.responsedata;

import cn.initialfire.tushare.api.stock.commonvo.StockEnums;
import lombok.Data;

@Data
public class StockCompanyInfo {
    // TS代码
    private String tsCode;

    // 公司名称
    private String comName;

    // 统一社会信用代码
    private String comId;

    // 交易所代码
    private StockEnums.Exchange exchange;

    // 法人代表
    private String chairman;

    // 总经理
    private String manager;

    // 董事会秘书
    private String secretary;

    // 注册资本
    private Double regCapital;

    // 注册日期
    private String setupDate;

    // 所在省份
    private String province;

    // 所在城市
    private String city;

    // 公司介绍
    private String introduction;

    // 公司主页
    private String website;

    // 电子邮件
    private String email;

    // 办公室
    private String office;

    // 员工人数
    private Integer employees;

    // 主要业务及产品
    private String mainBusiness;

    // 经营范围
    private String businessScope;

}
