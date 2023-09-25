package cn.tedu.baking.exception;


import cn.tedu.baking.common.response.StatusCode;
import lombok.Getter;

public class ServiceException extends RuntimeException{

    @Getter
    private StatusCode statusCode;


    public ServiceException(StatusCode statusCode) {
        super(statusCode.getMsg());
        this.statusCode=statusCode;
    }
}
