package cn.initialfire.tushare.api;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TushareRequest {
    private String apiName;
    private String token;
    private Object params;
    private String[] fields;

    public static TushareRequest newRequest(String apiName, Object paramObject) {
        TushareRequest request = new TushareRequest();
        request.setApiName(apiName);
        request.setParams(paramObject);
        return request;
    }
}
