package cn.initialfire.tushare.api.stock.responsedata;

import cn.initialfire.tushare.api.stock.commonvo.StockEnums;
import lombok.Data;

/**
 * Response class for stock_basic API
 * @see <a href="https://tushare.pro/document/2?doc_id=25">Tushare API Documentation</a>
 */
@Data
public class StockBasicInfo {
    /**
     * TS代码
     */
    private String tsCode;

    /**
     * 股票代码
     */
    private String symbol;

    /**
     * 股票名称
     */
    private String name;

    /**
     * 地域
     */
    private String area;

    /**
     * 所属行业
     */
    private String industry;

    /**
     * 股票全称
     */
    private String fullname;

    /**
     * 英文全称
     */
    private String enname;

    /**
     * 拼音缩写
     */
    private String cnspell;

    /**
     * 市场类型（主板/创业板/科创板/CDR）
     */
    private StockEnums.Market market;

    /**
     * 交易所代码
     */
    private String exchange;

    /**
     * 交易货币
     */
    private String currType;

    /**
     * 上市状态 L上市 D退市 P暂停上市
     */
    private StockEnums.ListStatus listStatus;

    /**
     * 上市日期
     */
    private String listDate;

    /**
     * 退市日期
     */
    private String delistDate;

    /**
     * 是否沪深港通标的，N否 H沪股通 S深股通
     */
    private StockEnums.HSType isHs;

    /**
     * 实控人名称
     */
    private String actName;

    /**
     * 实控人企业性质
     */
    private String actEntType;
} 