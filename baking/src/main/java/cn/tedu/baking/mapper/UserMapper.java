package cn.tedu.baking.mapper;


import cn.tedu.baking.pojo.entity.User;
import cn.tedu.baking.pojo.vo.UserVo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    UserVo selectByUsername(String username);
    int insert(User user);

}
