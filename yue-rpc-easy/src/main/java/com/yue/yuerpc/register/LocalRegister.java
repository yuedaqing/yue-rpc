package com.yue.yuerpc.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 本地注册中心
 */
public class LocalRegister {

    /**
     * 注册信息存储
     */
    private static final Map<String, Class<?>> map = new ConcurrentHashMap<>();

    /**
     * 注册服务
     *
     * @param serverName 服务名称
     * @param implClass  服务类
     */
    public static void register(String serverName, Class<?> implClass) {
        map.put(serverName, implClass);
    }

    /**
     * 获取服务
     *
     * @param serverName 服务名称
     * @return 结果
     */
    public static Class<?> get(String serverName) {
        return map.get(serverName);
    }

    /**
     * 删除服务
     *
     * @param serverName 服务名称
     */
    public static void remove(String serverName) {
        map.remove(serverName);
    }
}
