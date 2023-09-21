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

    @Override
    public void login(UserLoginDTO userLoginDTO) {
        UserVO userVO= mapper.selectByUsername(userLoginDTO.getUsername());
//        没查到
        if(userVO==null){
            throw new ServiceException(StatusCode.USERNAME_ERROR);
        }
//        密码不相等 密码错误
        if(!userVO.getPassword().equals(userLoginDTO.getPassword())){
            throw new ServiceException(StatusCode.PASSWORD_ERROR);
        }

    }
}
