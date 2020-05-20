package com.wang.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeptProvider_8001 {

    private static final Logger log = LoggerFactory.getLogger( DeptProvider_8001.class );

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

        SpringApplication.run( DeptProvider_8001.class, args );

    }

}
