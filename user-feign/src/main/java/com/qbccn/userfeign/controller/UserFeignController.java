package com.qbccn.userfeign.controller;

import com.qbccn.userfeign.feign.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserFeignController {

    @Autowired
    private UserServiceFeign userServiceFeign;

    @GetMapping("info")
    @ResponseBody
    public Object info() {
        return userServiceFeign.GetInfo();
    }
}
