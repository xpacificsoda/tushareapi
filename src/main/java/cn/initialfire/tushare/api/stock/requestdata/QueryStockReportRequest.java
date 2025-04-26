package cn.initialfire.tushare.api.stock.requestdata;

import lombok.Data;

@Data
public class QueryStockReportRequest {

    /**
     * 股票代码
     */
    private String tsCode;

    /**
     * 公告日期
     */
    private String annDate;

    /**
     * 实际公告日期
     */
    private String fAnnDate;

    /**
     * 公告开始时间
     */
    private String startDate;

    /**
     * 公告结束时间
     */
    private String endDate;

    /**
     * 报告期(每个季度最后一天的日期，比如20171231表示年报，20170630半年报，20170930三季报)
     */
    private String period;

    /**
     * 报告类型
     */
    private String reportType;

    /**
     * 公司类型（1一般工商业, 2银行, 3保险, 4证券）
     */
    private String compType;
    
}
