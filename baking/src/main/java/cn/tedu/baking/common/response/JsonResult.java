package cn.tedu.baking.common.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JsonResult<T> {
    //响应状态码[内部业务状态码]:比如 1000
    @ApiModelProperty("状态码")
    private Integer code;
    //状态码的含义: 比如 未登录
    @ApiModelProperty("消息提示")
    private String msg;
    //响应具体数据: 可以为Java对象,可以为List集合,可以为null
    private T data;

    /**
     * 第1个构造方法：只封装状态码和提示消息,针对于不需要返回具体数据的这一类控制器方法[功能]
     */
    public JsonResult(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    /**
     * 第2个构造方法：用于Controller中不需要返回具体数据的方法[使用自定义枚举类]
     */
    public JsonResult(StatusCode statusCode){
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
    }

    /**
     * 第3个构造方法：用于Controller中需要返回具体数据的方法[使用自定义枚举类]
     */
    public JsonResult(StatusCode statusCode, T data){
        //41行和42行代码可以简化为：this(statusCode);
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
        this.data = data;
    }

    /**
     * 第4个构造方法：用于快速构建JsonResult对象[操作成功的业务场景]
     */
    public JsonResult(T data){
        this.code = StatusCode.SUCCESS.getCode();
        this.msg = StatusCode.SUCCESS.getMsg();
        this.data = data;
    }

    /**
     * 静态方法1：构建有具体数据返回的JsonResult对象
     * 针对于操作成功的业务场景
     */
    public static JsonResult ok(Object data){
        return new JsonResult(data);
    }

    /**
     * 静态方法2：构建没有具体数据返回的JsonResult对象
     * 针对于操作成功的业务场景
     */
    public static JsonResult ok(){
        return ok(null);
    }

}







