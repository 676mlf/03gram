package cn.detu.weibe.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 指定微博所有评论的VO类
 */
@Data
public class CommentVO {
    //评论内容 评论时间 评论ID 用户昵称
    private String content;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private Date created;
    private Integer id;
    private String nickname;
}
