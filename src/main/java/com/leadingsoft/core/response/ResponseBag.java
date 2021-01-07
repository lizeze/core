package com.leadingsoft.core.response;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
@Getter
@Setter
public class ResponseBag<T> {
    private Date createTime;
    private T data;
    private ErrorCode errorCode;
    public ResponseBag() {
        this.createTime = new Date();
    }
    public ResponseBag(T data) {
        this.createTime = new Date();
        this.data = data;
    }
    public ResponseBag(T data, Integer code, String message) {
        this.createTime = new Date();
        this.data = data;
        this.errorCode = new ErrorCode();
        this.errorCode.setCode(code);
        this.errorCode.setMessage(message);
    }
}