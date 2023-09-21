package cn.detu.weibe.pojo.vo;

import lombok.Data;

/**
 * 注册功能 登录功能 获取当前用户 的VO类
 */
@Data
public class UserVO {
    /*
        用户ID: 前端保存用户id,后期可以发微博
        用户昵称: 为了前端显示 欢迎你,xxx
        用户密码: 为了后期登录功能密码校验
     */
    private Integer id;
    private String nickname;
    private String password;
}







