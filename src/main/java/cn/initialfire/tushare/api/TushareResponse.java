package cn.initialfire.tushare.api;

import com.fasterxml.jackson.databind.JsonNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TushareResponse {

    private int code;
    private String msg;
    private String requestId;
    private JsonNode data;
}