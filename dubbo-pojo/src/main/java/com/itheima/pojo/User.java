package com.itheima.pojo;

import java.io.Serializable;

/**
 * 注意：
 *      将来所有的pojo类都需要实现Serializable接口
 * @author 子木
 * @version 1.0
 * @date 2023/1/31  14:36
 * @since 1.0
 */
public class User implements Serializable {
    private static final long serialVersionUID = -3413714650939269115L;
    private int id;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User() {
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
