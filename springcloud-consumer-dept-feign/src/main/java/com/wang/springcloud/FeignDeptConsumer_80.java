package com.wang.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动程序
 *
 * @author Tim
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.wang.springcloud"})
@ComponentScan("com.wang.springcloud")
public class FeignDeptConsumer_80 {

    private static final Logger log = LoggerFactory.getLogger( FeignDeptConsumer_80.class );

    public static void main(String[] args) {

        log.info("=============== INFO信息提示 ===============");
        log.info("=============== INFO信息提示 ===============");
        log.info("=============== INFO信息提示 ===============");
        log.info("=============== INFO信息提示 ===============");
        log.info("=============== INFO信息提示 ===============");

        log.warn("=============== WARN信息提示 ===============");
        log.warn("=============== WARN信息提示 ===============");
        log.warn("=============== WARN信息提示 ===============");
        log.warn("=============== WARN信息提示 ===============");
        log.warn("=============== WARN信息提示 ===============");

        SpringApplication.run( FeignDeptConsumer_80.class, args );

    }

}
