package cn.detu.weibe.controller;


import cn.detu.weibe.mapper.UserMapper;
import cn.detu.weibe.pojo.dto.UserLoginDTO;
import cn.detu.weibe.pojo.dto.UserRegDTO;
import cn.detu.weibe.pojo.entity.User;
import cn.detu.weibe.pojo.vo.UserVO;
import cn.detu.weibe.response.JsonResult;
import cn.detu.weibe.response.StatusCode;
import cn.detu.weibe.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/v1/users/")
public class UserController {
    @Autowired
    IUserService userService;



    @PostMapping("reg")
    public JsonResult reg(@RequestBody UserRegDTO userRegDTO){

        userService.reg(userRegDTO);

        return  JsonResult.ok();
    }

    @PostMapping("login")
    public JsonResult login(@RequestBody UserLoginDTO loginDTO){
        userService.login(loginDTO);
        return JsonResult.ok();
    }







}
