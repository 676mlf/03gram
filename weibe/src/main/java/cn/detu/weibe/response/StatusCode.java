package cn.detu.weibe.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum StatusCode {
    //所有的实例都写在最上面
    SUCCESS(1,"ok"),
    NOT_LOGIN(1000,"未登录"),
    LOGIN_SUCCESS(1001,"登录成功"),
    PASSWORD_ERROR(1002,"密码错误"),
    USERNAME_ERROR(1003, "用户名错误"),
    USERNAME_ALREADY_EXISTS(1004, "用户名被占用"),
    OPERATION_SUCCESS(2001, "操作成功"),
    OPERATION_FAILED(2002,"操作失败"),
    VALIDATE_ERROR(3002, "请求参数有误");

    //自定义内部状态码
    private Integer code;
    //状态码的含义
    private String msg;
}






