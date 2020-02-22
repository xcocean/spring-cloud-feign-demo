package com.qbccn.userservice.service.impl;

import com.qbccn.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component //交给spring托管
public class UserServiceImpl implements UserService {
    // 用于显示负载均衡，端口区分
    @Value("${server.port}")
    private int port;

    @Override
    public Object getInfo() {
        System.out.println("被调用！当前端口：" + port);
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", 23);
        map.put("sex", "男");
        map.put("port", port);
        return map;
    }
}
