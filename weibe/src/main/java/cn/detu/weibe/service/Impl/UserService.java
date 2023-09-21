package cn.detu.weibe.service.Impl;

import cn.detu.weibe.exception.ServiceException;
import cn.detu.weibe.mapper.UserMapper;
import cn.detu.weibe.pojo.dto.UserLoginDTO;
import cn.detu.weibe.pojo.dto.UserRegDTO;
import cn.detu.weibe.pojo.entity.User;
import cn.detu.weibe.pojo.vo.UserVO;
import cn.detu.weibe.response.StatusCode;
import cn.detu.weibe.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class UserService implements IUserService {
    @Autowired
    UserMapper mapper;
    @Override
    public void reg(UserRegDTO userRegDTO) {
        UserVO userVO= mapper.selectByUsername(userRegDTO.getUsername());
        if(userVO!=null){
            throw new ServiceException(StatusCode.USERNAME_ALREADY_EXISTS);
        }
        User user=new User();
        BeanUtils.copyProperties(userRegDTO,user);
        user.setCreated(new Date());
        mapper.insert(user);
    }
    @Autowired
    AuthenticationManager manager;

    @Override
    public void login(UserLoginDTO userLoginDTO) {
        Authentication result = manager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        userLoginDTO.getUsername(),userLoginDTO.getPassword()));
        //把认证结果保存到Security框架的上下文当中
        SecurityContextHolder.getContext().setAuthentication(result);
        //从认证结果中得到当事人(当前登录成功的,装着用户信息的对象)
    }

}
