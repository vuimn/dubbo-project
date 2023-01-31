package com.itheima.service.impl;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author 子木
 * @version 1.0
 * @date 2023/1/30  16:53
 * @since 1.0
 */
//@Service
@Service//将这个类提供的方法（服务）对外发布。将访问的地址 ip，端口，路径注册到注册中心中
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        return "hello dubbo hello lk!!";
    }

    @Override
    public User findUserById(int id) {
        // 查询User对象
        User user = new User(1, "zhangsan", "123");
        return user;
    }
}
