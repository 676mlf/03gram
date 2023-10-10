package cn.tedu.baking.controller;


import cn.tedu.baking.common.response.JsonResult;
import cn.tedu.baking.service.IBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/banners/")
public class BannerController {
    @Autowired
    IBannerService bannerService;

    @GetMapping("")
    public JsonResult listForIndex(){

        return JsonResult.ok(bannerService.listForIndex());


    }



}
