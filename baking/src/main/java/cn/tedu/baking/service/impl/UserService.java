package cn.tedu.baking.service.impl;

import cn.tedu.baking.common.response.StatusCode;
import cn.tedu.baking.exception.ServiceException;
import cn.tedu.baking.mapper.UserMapper;
import cn.tedu.baking.pojo.dto.UserRegDTO;
import cn.tedu.baking.pojo.entity.User;
import cn.tedu.baking.pojo.vo.UserVo;
import cn.tedu.baking.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class UserService  implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public void reg(UserRegDTO userRegDTO) {
        UserVo userVO = userMapper.selectByUsername(userRegDTO.getUsername());
        if (userVO!=null){
            throw new ServiceException(StatusCode.USERNAME_ALREADY_EXISTS);
        }
        User user = new User();
        BeanUtils.copyProperties(userRegDTO,user);

        user.setCreatTime(new Date());
        user.setIsAdmin(0);
        userMapper.insert(user);
    }



    }

