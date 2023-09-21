package cn.detu.weibe.pojo.entity;

import lombok.Data;

import java.util.Date;

/**
 * 微博表实体类
 */
@Data
public class Weibo {
    private Integer id;
    private String content;
    private Date created;
    private Integer userId;
}
