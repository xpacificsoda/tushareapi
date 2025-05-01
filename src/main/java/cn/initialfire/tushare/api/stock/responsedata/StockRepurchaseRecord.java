package cn.initialfire.tushare.api.stock.responsedata;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockRepurchaseRecord {
    /**
     * TS代码
     */
    private String tsCode;

    /**
     * 公告日期
     */
    private String annDate;

    /**
     * 截止日期
     */
    private String endDate;

    /**
     * 进度
     */
    private String proc;

    /**
     * 过期日期
     */
    private String expDate;

    /**
     * 回购数量
     */
    private Double vol;

    /**
     * 回购金额
     */
    private Double amount;

    /**
     * 回购最高价
     */
    private Double highLimit;

    /**
     * 回购最低价
     */
    private Double lowLimit;

}
