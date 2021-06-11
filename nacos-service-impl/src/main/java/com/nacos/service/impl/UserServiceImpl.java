package com.nacos.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.nacos.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceImpl implements UserService {

    @Autowired
    private UserConfig userConfig;
    @Override
    public String getUser(String userName) {

        return "a===>>"+JSONObject.toJSONString(userConfig.getCoder());
    }
}
