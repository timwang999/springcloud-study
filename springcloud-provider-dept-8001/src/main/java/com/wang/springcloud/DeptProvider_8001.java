package com.wang.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * 启动类
 * @author Tim
 */

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
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

    // 增加一个 Servlet
    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        registrationBean.addUrlMappings( "/actuator/hystrix.stream" );
        return registrationBean;
    }

}
