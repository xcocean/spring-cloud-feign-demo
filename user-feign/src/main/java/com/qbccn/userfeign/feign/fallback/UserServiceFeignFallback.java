package com.qbccn.userfeign.feign.fallback;

import com.qbccn.userfeign.feign.UserServiceFeign;
import org.springframework.stereotype.Component;

@Component //交给spring托管
public class UserServiceFeignFallback implements UserServiceFeign {

    @Override
    public Object GetInfo() {
        return "触发熔断！";
    }
}
