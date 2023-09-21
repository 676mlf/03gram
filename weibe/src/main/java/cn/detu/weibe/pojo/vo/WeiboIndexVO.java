package cn.detu.weibe.pojo.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 微博首页列表VO类
 */
@Data
public class WeiboIndexVO {
    //微博id 微博内容 用户昵称
    @ApiModelProperty("微博id")
    private Integer id;
    @ApiModelProperty("内容")
    private String content;
    @ApiModelProperty("用户昵称")
    private String nickname;
}







