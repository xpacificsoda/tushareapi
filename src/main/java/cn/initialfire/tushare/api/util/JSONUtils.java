package cn.initialfire.tushare.api.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.JavaType;
import cn.initialfire.tushare.api.exception.TushareException;
import cn.initialfire.tushare.api.exception.ErrorCodes;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;

public class JSONUtils {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    static {
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setVisibility(objectMapper.getSerializationConfig().getDefaultVisibilityChecker()
                .withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));
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

    public static String[] getFieldNames(Class<?> responseClass) {
        return objectMapper.getSerializationConfig()
                .introspect(objectMapper.constructType(responseClass))
                .findProperties()
                .stream()
                .map(BeanPropertyDefinition::getName)
                .toArray(String[]::new);
    }

    public static String[] getFieldNames(TypeReference<?> typeReference) {
        try {
            // Get the raw type from the TypeReference
            Type actualType = typeReference.getType();
            actualType = ((ParameterizedType) actualType).getActualTypeArguments()[0];
            JavaType javaType = objectMapper.constructType(actualType);
            Class<?> rawType = javaType.getRawClass();
            return getFieldNames(rawType);
        } catch (Exception e) {
            throw new TushareException(ErrorCodes.JSON_FIELD_NAME_ERROR, "Failed to get field names from TypeReference", e);
        }
    }
}
