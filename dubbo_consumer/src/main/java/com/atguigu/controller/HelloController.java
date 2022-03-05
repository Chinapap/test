package com.atguigu.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author尹晶
 * @Date2022/3/1 18:45
 * @Version 1.0
 */
@RestController
@RequestMapping("/demo")
public class HelloController {
    @Reference(timeout = 1000000)//引用远程的服务，进行远程调用
    private HelloService helloService;
    @RequestMapping("/hello")
    public String sayHello(String name){
       return helloService.sayHello(name);
    }
}
