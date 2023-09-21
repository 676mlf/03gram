package cn.detu.weibe.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 登录功能DTO类
 */
@Data
public class UserLoginDTO {
    //用户名 密码
    /*
        1.ApiModelProperty注解:Knife4j注解,添加在POJO类属性上
          value参数: Knife4j页面中指定参数名称说明;
          required参数: Knife4j页面中指定该参数是否为必须,但是不会真正去校验,只是显示在文档中
          example参数: 页面中指定参数的示例值
     */
    @ApiModelProperty(value = "用户名", required = true, example = "Lucy")
    private String username;
    @ApiModelProperty(value = "密码", required = true, example = "123456")
    private String password;
}
