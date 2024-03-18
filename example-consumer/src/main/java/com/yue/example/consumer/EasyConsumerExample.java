package com.yue.example.consumer;

import com.yue.example.common.model.User;
import com.yue.example.common.service.UserService;

/**
 * 简易服务消费者
 */
public class EasyConsumerExample {
    public static void main(String[] args) {
        //todo 需要获取UserService的实现类对象
        UserService userService = null;
        User user = new User();
        user.setName("yueyue");
        //调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println("newUser.getName() = " + newUser.getName());
        } else {
            System.out.println("user == null");
        }

    }
}
