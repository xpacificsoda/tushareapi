package cn.initialfire.tushare.api.stock.commonvo;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class MarketDeserializer extends JsonDeserializer<StockEnums.Market> {
    @Override
    public StockEnums.Market deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String value = p.getText();
        
        // First try to match by enum name
        try {
            return StockEnums.Market.valueOf(value);
        } catch (IllegalArgumentException e) {
            // If not found by name, try to match by description
            for (StockEnums.Market market : StockEnums.Market.values()) {
                if (market.getDescription().equals(value)) {
                    return market;
                }
            }
            throw new IllegalArgumentException("Invalid market value: " + value);
        }
    }
} 