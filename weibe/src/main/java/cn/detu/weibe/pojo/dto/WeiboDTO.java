package cn.detu.weibe.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 发布微博DTO类
 */
@Data
public class WeiboDTO {
    //微博内容
    @ApiModelProperty(value = "微博内容", required = true)
    private String content;
}
