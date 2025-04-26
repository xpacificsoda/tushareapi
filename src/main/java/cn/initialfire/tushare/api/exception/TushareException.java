package cn.initialfire.tushare.api.exception;

import lombok.Getter;

@Getter
public class TushareException extends RuntimeException {
    private long errorCode;
    private String errorMsg;

    public TushareException(long errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public TushareException(long errorCode, String errorMsg, Throwable cause) {
        super(errorMsg, cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}