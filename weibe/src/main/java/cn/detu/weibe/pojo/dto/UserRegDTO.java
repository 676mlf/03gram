package cn.detu.weibe.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 注册功能DTO类
 */
@Data
public class UserRegDTO {
    /*
        1.NotNull: Validation注解,不允许为空值null
        2.NotEmpty: Validation注解,不允许为null,也不允许为空字符串""
        3.NotBlank:Validation注解,不允许为null,也不允许为空字符串,也不允许为空白串
        4.Size:Validation注解,只针对于字符串类型,不能针对于数值类型
     */
    //@NotNull(message = "用户名不能为空值null")
    //@NotEmpty(message = "用户名不能为空字符串,也不能为null")
    @NotBlank(message = "用户名不能为空白|空字符串|null")
    @Size(min = 6, max = 10, message = "用户名必须在6-10位之间")
    @ApiModelProperty(value = "用户名", required = true)
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    private String password;
    @ApiModelProperty(value = "用户昵称", required = true)
    private String nickname;
}







