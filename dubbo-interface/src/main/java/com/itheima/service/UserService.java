package com.itheima.service;


import com.itheima.pojo.User;

/**
 * @author 子木
 * @version 1.0
 * @date 2023/1/30  16:51
 * @since 1.0
 */
public interface UserService {

    public String sayHello();

    public User findUserById(int id);
}
