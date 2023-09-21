package cn.detu.weibe.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 微博详情页VO
 */
@Data
public class WeiboDetailVO {
    private Integer id;
    private String content;
    //设置日期时间格式以及时区
    //小大小 大小小  yyyyMMdd HHmmss
    //@JsonFormat(pattern = "yyyy年MM月dd日 HH时mm分ss秒", timezone = "GMT+8")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date created;
    private String nickname;
}
