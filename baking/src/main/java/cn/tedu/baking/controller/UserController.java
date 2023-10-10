package cn.tedu.baking.controller;


import cn.tedu.baking.common.response.JsonResult;
import cn.tedu.baking.pojo.dto.UserRegDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/users/")
public class UserController {



@PostMapping("reg")
    public JsonResult reg(@RequestBody @Validated UserRegDTO userRegDTO){
        return JsonResult.ok();

    }
}
