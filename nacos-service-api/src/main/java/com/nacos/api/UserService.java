package com.nacos.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserService {
    @GetMapping("/getUser")
    String getUser(@RequestParam("userName") String userName);
}
