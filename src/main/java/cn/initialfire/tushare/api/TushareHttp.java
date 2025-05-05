package cn.initialfire.tushare.api;

import com.fasterxml.jackson.core.type.TypeReference;

import cn.initialfire.tushare.api.util.HttpUtils;
import cn.initialfire.tushare.api.util.JSONUtils;
import cn.initialfire.tushare.api.exception.TushareException;
import cn.initialfire.tushare.api.exception.ErrorCodes;

public class TushareHttp {

    private static final String BASE_URL = "https://api.tushare.pro";
    private static TushareHttp instance;

    private String token;

    public static TushareHttp instance() {
        if (instance == null) {
            instance = new TushareHttp();
        }
        return instance;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public TushareResponse send(TushareRequest request) {
        request.setToken(token);
        String json = JSONUtils.toJSONString(request);
        String response = HttpUtils.post(BASE_URL, json);
        TushareResponse tushareResponse =  JSONUtils.parseObject(response, TushareResponse.class);
        if (tushareResponse.getCode() != 0) {
            throw new TushareException(ErrorCodes.INVOKE_TUSHARE_API_ERROR, tushareResponse.getMsg());
        }
        return tushareResponse;
    }

    public <T> T send(TushareRequest request, Class<T> responseClass) {
        String[] fields = JSONUtils.getFieldNames(responseClass);
        request.setFields(fields);
        TushareResponse response = send(request);
        return JSONUtils.parseObjectFromTableStyleData(response.getData(), responseClass);
    }

    public <T> T send(TushareRequest request, TypeReference<T> responseType) {
        String[] fields = JSONUtils.getFieldNames(responseType);
        request.setFields(fields);
        TushareResponse response = send(request);
        return JSONUtils.parseObjectFromTableStyleData(response.getData(), responseType);
    }

    public <T> T send(String apiName, Object paramObject, Class<T> responseClass) {
        return send(TushareRequest.newRequest(apiName, paramObject), responseClass);
    }

    public <T> T send(String apiName, Object paramObject, TypeReference<T> responseType) {
        return send(TushareRequest.newRequest(apiName, paramObject), responseType);
    }
}
