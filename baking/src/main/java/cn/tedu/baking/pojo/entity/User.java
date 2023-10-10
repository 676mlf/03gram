package cn.tedu.baking.pojo.entity;

import lombok.Data;

import java.util.Date;
@Data
public class User {
    private long id;
    private String username;
    private String password;
    private String nickname;
    private  Integer isAdmin;
    private String imgUrl;
    private Date creatTime;
}
