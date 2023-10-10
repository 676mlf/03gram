package cn.tedu.baking.pojo.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class UserRegDTO {
    @NotBlank(message = "用户名不能为空白|空字符串|null")
    @Size(min = 1, max = 10, message = "用户名必须在1-10位之间")
    private String username;
    @NotBlank(message = "密码名不能为空白|空字符串|null")
    @Size(min = 1, max = 10, message = "密码必须在1-10位之间")
    private String password;
    @NotBlank(message = "昵称不能为空白|空字符串|null")
    @Size(min = 1, max = 10, message = "昵称必须在1-10位之间")
    private String nickname;
}
