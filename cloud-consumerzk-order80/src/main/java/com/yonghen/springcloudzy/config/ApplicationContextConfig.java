package com.yonghen.springcloudzy.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: ZhangYi
 * @Date: 2022/07/13/  22:06
 * @Description:
 */


@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestRemplate(){
        return new RestTemplate();
    }
}
