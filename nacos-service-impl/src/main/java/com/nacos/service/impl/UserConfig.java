package com.nacos.service.impl;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "user")
@Getter
@Setter
@RefreshScope
public class UserConfig {
    private List<Map<String,String>>  coder;
}
