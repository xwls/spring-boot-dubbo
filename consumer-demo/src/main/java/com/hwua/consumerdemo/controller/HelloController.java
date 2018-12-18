package com.hwua.consumerdemo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hwua.commondemo.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 1. 添加dubbo剂zkclient的依赖
 * 2. 配置dubbo
 * 3. 使用@Reference注解获取注册中心中的服务
 */
@Controller
public class HelloController {

    @Reference
    private DemoService demoService;


    @RequestMapping("/hello")
    @ResponseBody
    public String hello(String name){
        return demoService.sayHello(name);
    }

}
