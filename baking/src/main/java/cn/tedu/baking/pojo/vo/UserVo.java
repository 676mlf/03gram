package cn.tedu.baking.pojo.vo;


import lombok.Data;

@Data
public class UserVo {
    private Long id;
    private String password;
    private String nickname;
    private String imUrl;
}
