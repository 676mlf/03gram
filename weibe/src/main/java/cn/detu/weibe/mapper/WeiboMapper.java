package cn.detu.weibe.mapper;


import cn.detu.weibe.pojo.vo.WeiboIndexVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeiboMapper {
    List<WeiboIndexVO>selectForIndex();
}
