package com.yonghen.springcloudzy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: ZhangYi
 * @Date: 2022/07/13/  22:08
 * @Description:
 */

@RestController
@Slf4j
public class OrderZKController {

    public static final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping(value = "/consumer/payment/zk")
    public String paymnetInfo(){
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/payment/zk", String.class);
        return result;
    }
}
