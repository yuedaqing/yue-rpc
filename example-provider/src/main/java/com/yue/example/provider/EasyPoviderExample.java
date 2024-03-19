package com.yue.example.provider;

import com.yue.example.common.service.UserService;
import com.yue.yuerpc.register.LocalRegister;
import com.yue.yuerpc.server.HttpServer;
import com.yue.yuerpc.server.VertxHttpServer;

/**
 * 简易服务提供者示例
 */
public class EasyPoviderExample {

    public static void main(String[] args) {
        // 服务注册
        LocalRegister.register(UserService.class.getName(), UserServiceImpl.class);

        // 启动web服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
