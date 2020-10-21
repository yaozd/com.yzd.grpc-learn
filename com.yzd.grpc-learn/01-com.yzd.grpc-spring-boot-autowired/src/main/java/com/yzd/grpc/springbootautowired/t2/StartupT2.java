package com.yzd.grpc.springbootautowired.t2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * SpringBoot实践-BeanPostProcessor的作用和妙用
 * https://www.jianshu.com/p/6a48675ef7a3
 *
 * 代理拦截方法
 * @Author: yaozh
 * @Description:
 */
@Slf4j
@SpringBootApplication
public class StartupT2 {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext applicationContext = SpringApplication.run(StartupT2.class, args)) {
            HelloServiceTest helloService = applicationContext.getBean(HelloServiceTest.class);
            helloService.testSayHello();
            helloService.testSayHello();
        }
    }
}