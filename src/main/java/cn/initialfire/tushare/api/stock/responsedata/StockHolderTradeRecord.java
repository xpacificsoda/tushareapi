package cn.initialfire.tushare.api.stock.responsedata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockHolderTradeRecord {
    /**
     * TS代码
     */
    private String tsCode;

    /**
     * 公告日期
     */
    private String annDate;

    /**
     * 股东名称
     */
    private String holderName;

    /**
     * 股东类型
     */
    private String holderType;

    /**
     * 类型(增持/减持)
     */
    private String inDe;

    /**
     * 变动数量
     */
    private Double changeVol;

    /**
     * 占流通比例
     */
    private Double changeRatio;

    /**
     * 变动后持股
     */
    private Double afterShare;

    /**
     * 变动后占流通比例
     */
    private Double afterRatio;

    /**
     * 平均价格
     */
    private Double avgPrice;

    /**
     * 持股总数
     */
    private Double totalShare;

    /**
     * 增减持开始日期
     */
    private String beginDate;

    /**
     * 增减持结束日期
     */
    private String closeDate;
}