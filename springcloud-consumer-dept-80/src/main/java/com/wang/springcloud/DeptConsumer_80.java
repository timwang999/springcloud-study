package com.wang.springcloud;

import com.wang.myrule.KuangRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 启动程序
 *
 * @author Tim
 */

@SpringBootApplication
@EnableEurekaClient
// 在微服务启动的时候就能去加载我们自定义的Ribbon类
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT", configuration = KuangRule.class)
public class DeptConsumer_80 {

    private static final Logger log = LoggerFactory.getLogger( DeptConsumer_80.class );

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

        SpringApplication.run( DeptConsumer_80.class, args );

    }

}
