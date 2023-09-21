package cn.detu.weibe.controller;


import cn.detu.weibe.response.JsonResult;
import cn.detu.weibe.service.IWeiboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/weibos/")
public class WeiboController {
    @Autowired
    IWeiboService weiboService;

    @GetMapping("")
    public JsonResult list(){

        return JsonResult.ok();

    }

}
