package cn.detu.weibe.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 发表评论的DTO类
 */
@Data
public class CommentDTO {
    //评论内容 微博ID
    @ApiModelProperty(value = "评论内容", required = true)
    private String content;
    @ApiModelProperty(value = "微博ID", required = true)
    private Integer weiboId;
}







