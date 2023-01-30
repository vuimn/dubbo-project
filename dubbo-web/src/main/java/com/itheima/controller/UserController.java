package com.itheima.controller;

import com.itheima.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 子木
 * @version 1.0
 * @date 2023/1/30  17:10
 * @since 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    // 注入Service
    //@Autowired//本地注入

    /**
     *  1.从zookeeper注册中心获取userService的访问url
     *  2.进行远程调用RPC
     *  3.将结果封装为一个代理对象。给变量赋值
     */

    @Reference//远程注入
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return userService.sayHello();
    }
}
