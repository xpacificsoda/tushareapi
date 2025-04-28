package cn.initialfire.tushare.api.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.MediaType;
import java.io.IOException;

import cn.initialfire.tushare.api.exception.TushareException;
import cn.initialfire.tushare.api.exception.ErrorCodes;

public class HttpUtils {
    private static final OkHttpClient client = new OkHttpClient();

    public static String post(String url, String json) {
        RequestBody body = RequestBody.create(json, MediaType.parse("application/json"));
        Request request = new Request.Builder().url(url).post(body).build();
        try (Response response = client.newCall(request).execute()) {
            String responseBody = response.body().string();
            if (!response.isSuccessful()) {
                String message = String.format("HTTP request failed with status code %s, url: %s, body: %s", response.code(), url, json);
                throw new TushareException(ErrorCodes.INVOKE_TUSHARE_API_ERROR, message);
            }
            return responseBody;
        } catch (IOException e) {
            String message = String.format("IOException happened when sending HTTP request with url: %s, body: %s", url, json);
            throw new TushareException(ErrorCodes.TUSHARE_IO_EXCEPTION_ERROR, message);
        }
    }
}
