package com.yonghen.springcloudzy.controller;



import com.yonghen.springcloudzy.entities.CommonResult;
import com.yonghen.springcloudzy.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * (Payment)表控制层
 *
 * @author lixiaolong
 * @date 2022/01/13 16:05
 */
@RestController
@Slf4j
/*如果只有一个seg可以不加/,有多个必须加/ */
@RequestMapping("/payment")
public class PaymentController {


    @Value("${server.port}")
    private String serverPort;


    @RequestMapping(value = "/payment/zk")
    public String paymentzk() {
        return "springcloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }


}