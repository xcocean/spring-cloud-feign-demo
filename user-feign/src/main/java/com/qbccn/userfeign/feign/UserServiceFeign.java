package com.qbccn.userfeign.feign;

import com.qbccn.userfeign.feign.fallback.UserServiceFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 说明一下，这个user-service是指服务提供者，注册到nacos上的，不区分大小写
 * path 表示是user-service服务下的 /user/info 这个路径
 * fallback 熔断执行的回调
 */
@FeignClient(value = "user-service", path = "user",fallback = UserServiceFeignFallback.class)
public interface UserServiceFeign {

    @GetMapping(value = "info")
    Object GetInfo();
}
