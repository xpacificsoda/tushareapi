package cn.initialfire.tushare.api.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.core.type.TypeReference;

import cn.initialfire.tushare.api.exception.TushareException;
import cn.initialfire.tushare.api.exception.ErrorCodes;

public class JSONUtils {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    static {
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static String toJSONString(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) { 
            String message = String.format("Failed to convert object to JSON string, object: %s", obj);
            throw new TushareException(ErrorCodes.JSON_SERIALIZATION_ERROR, message, e);
        }
    }

    public static <T> T parseObject(String jsonString, Class<T> valueType) {
        try {
            return objectMapper.readValue(jsonString, valueType);
        } catch (JsonProcessingException e) {
            String message = String.format("Failed to parse JSON string to object, jsonString: %s, valueType: %s", jsonString, valueType);
            throw new TushareException(ErrorCodes.JSON_DESERIALIZATION_ERROR, message, e);
        }
    }

    public static <T> T parseObject(String jsonString, TypeReference<T> typeReference) {
        try {
            return objectMapper.readValue(jsonString, typeReference);
        } catch (JsonProcessingException e) {
            String message = String.format("Failed to parse JSON string to object, jsonString: %s, typeReference: %s", jsonString, typeReference);
            throw new TushareException(ErrorCodes.JSON_DESERIALIZATION_ERROR, message, e);
        }
    }

    public static ArrayNode transformTableStyleData(JsonNode tableStyleData) {
        ArrayNode actualData = objectMapper.createArrayNode();
        ArrayNode fields = (ArrayNode) tableStyleData.get("fields");
        ArrayNode items = (ArrayNode) tableStyleData.get("items");
        for (JsonNode item : items) {
            ObjectNode actualItem = objectMapper.createObjectNode();
            for (int i = 0; i < fields.size(); i++) {
                actualItem.set(fields.get(i).asText(), item.get(i));
            }
            actualData.add(actualItem);
        }
        return actualData;
    }

    public static <T> T parseObjectFromTableStyleData(JsonNode jsonNode, Class<T> valueType) {
        ArrayNode arrayNode = transformTableStyleData(jsonNode);
        return objectMapper.convertValue(arrayNode, valueType);
    }

    public static <T> T parseObjectFromTableStyleData(JsonNode jsonNode, TypeReference<T> typeReference) {
        ArrayNode arrayNode = transformTableStyleData(jsonNode);
        return objectMapper.convertValue(arrayNode, typeReference);
    }
}
