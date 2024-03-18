package com.yue.example.common.service;

import com.yue.example.common.model.User;

/**
 * 用户服务
 */
public interface UserService {

    /**
     * 获取用户
     *
     * @param user 用户信息
     * @return 结果
     */
    User getUser(User user);
}
