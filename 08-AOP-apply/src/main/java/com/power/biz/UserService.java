package com.power.biz;

import org.springframework.stereotype.Component;


@Component
public class UserService {
    //用户业务

    public void getUser(){
        System.out.println("获取用户信息");
    }
    public void saveUser(){
        System.out.println("保存用户信息");
    }
    public void deleteUser(){
        System.out.println("删除用户信息");
    }
    public void modifyUser(){
        System.out.println("修改用户信息");
    }
}