package com.atguigu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author尹晶
 * @Date2022/3/1 23:08
 * @Version 1.0
// */
@Service(interfaceClass = HelloService.class,timeout = 50000000)
@Transactional
public class HelloserviceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "服务器收到" + name;
    }
}
