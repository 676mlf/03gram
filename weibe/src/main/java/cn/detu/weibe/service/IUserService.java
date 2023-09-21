package cn.detu.weibe.service;

import cn.detu.weibe.pojo.dto.UserLoginDTO;
import cn.detu.weibe.pojo.dto.UserRegDTO;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;



public interface IUserService {
    void reg(UserRegDTO userRegDTO);
    void login(UserLoginDTO userLoginDTO);
}
