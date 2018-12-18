package com.hwua.providerdemo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.hwua.commondemo.service.DemoService;
import org.springframework.stereotype.Component;

/*
1. 添加dubbo剂zkclient的依赖
2. 配置dubbo
3. 使用@Serivce注解将服务注册到zookeeper
 */
@Component
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
