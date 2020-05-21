package com.wang.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 * @author Tim
 */

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker // 添加对熔断的支持
public class DeptProviderHystrix_8001 {

    private static final Logger log = LoggerFactory.getLogger( DeptProviderHystrix_8001.class );

    public static void main(String[] args) {

        log.info("==================== INFO提示信息 ====================");
        log.info("==================== INFO提示信息 ====================");
        log.info("==================== INFO提示信息 ====================");
        log.info("==================== INFO提示信息 ====================");
        log.info("==================== INFO提示信息 ====================");

        log.warn("==================== WARN提示信息 ====================");
        log.warn("==================== WARN提示信息 ====================");
        log.warn("==================== WARN提示信息 ====================");
        log.warn("==================== WARN提示信息 ====================");
        log.warn("==================== WARN提示信息 ====================");

        SpringApplication.run( DeptProviderHystrix_8001.class, args );

    }

}
