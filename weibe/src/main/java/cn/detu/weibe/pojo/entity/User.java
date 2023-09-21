package cn.detu.weibe.pojo.entity;

import lombok.Data;

import java.util.Date;

/**
 * 用户表实体类
 */
@Data
public class User {
    //用户ID | 用户名 | 密码 | 昵称 | 注册时间
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private Date created;
}








