package cn.detu.weibe.mapper;

import cn.detu.weibe.pojo.entity.User;
import cn.detu.weibe.pojo.vo.UserVO;
import org.springframework.stereotype.Repository;



@Repository
public interface UserMapper {
    UserVO selectByUsername(String username);
    int insert(User user);

}
