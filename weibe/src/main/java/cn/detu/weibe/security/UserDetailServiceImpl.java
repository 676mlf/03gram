package cn.detu.weibe.security;

import cn.detu.weibe.mapper.UserMapper;
import cn.detu.weibe.pojo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    UserMapper mapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //username代表的是用户输入的用户名
        UserVO userVO = mapper.selectByUsername(username);
        //如果没查到代表用户名不存在
        if (userVO==null){
            return null;//此处返回null,Security框架会抛出一个代表用户名错误的异常
        }
        //创建用户详情对象, 把用户名/密码/权限 赋值给此对象
        UserDetails ud = User.builder().username(username)
               .password(userVO.getPassword())
                .authorities("权限")  //给当前登录的用户授权
               .build();
        //创建自定义的用户详情对象,把id/昵称/用户名/密码/权限 赋值给此对象


        return null;
    }
}
