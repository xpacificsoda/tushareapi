package cn.initialfire.tushare.api.stock.commonvo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Enums for stock-related fields
 */
public class StockEnums {
    
    /**
     * Market type enum
     */
    @JsonDeserialize(using = MarketDeserializer.class)
    public enum Market {
        MAIN("主板"), // main board
        GEM("创业板"), // growth enterprise market
        STAR("科创板"), // science and technology innovation board
        CDR("CDR"), // China Depository Receipts
        BSE("北交所"); // Beijing Stock Exchange

        private final String description;

        Market(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    /**
     * Listing status enum
     */
    public enum ListStatus {
        L("上市"),
        D("退市"),
        P("暂停上市");

        private final String description;

        ListStatus(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    /**
     * Exchange code enum
     */
    public enum Exchange {
        SSE("上交所"),
        SZSE("深交所"),
        BSE("北交所");

        private final String description;

        Exchange(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    /**
     * Stock Connect status enum
     */
    public enum HSType {
        N("否"),
        H("沪股通"),
        S("深股通");

        private final String description;

        HSType(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
} 