package com.yue.example.provider;

import com.yue.yuerpc.server.HttpServer;
import com.yue.yuerpc.server.VertxHttpServer;

/**
 * 简易服务提供者示例
 */
public class EasyPoviderExample {

    public static void main(String[] args) {
        //提供服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
