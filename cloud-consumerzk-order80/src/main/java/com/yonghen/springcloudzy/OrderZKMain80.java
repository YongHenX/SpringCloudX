package com.yonghen.springcloudzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: ZhangYi
 * @Date: 2022/07/13/  22:04
 * @Description:
 */


@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderZKMain80.class, args);
    }
}
