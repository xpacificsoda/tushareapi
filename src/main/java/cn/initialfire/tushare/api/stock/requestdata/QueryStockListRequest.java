package cn.initialfire.tushare.api.stock.requestdata;

import cn.initialfire.tushare.api.stock.commonvo.StockEnums;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class QueryStockListRequest extends BaseRequestData {

    // TS股票代码
    private String tsCode;

    // 股票名称
    private String name;

    // 市场类型 （主板/创业板/科创板/CDR/北交所）
    private StockEnums.Market market;

    // 上市状态 L上市 D退市 P暂停上市，默认是L
    private StockEnums.ListStatus listStatus;

    // 交易所代码 SSE上交所 SZSE深交所 BSE北交所
    private StockEnums.Exchange exchange;

    // 是否沪深港通标的，N否 H沪股通 S深股通
    private StockEnums.HSType isHs;
}