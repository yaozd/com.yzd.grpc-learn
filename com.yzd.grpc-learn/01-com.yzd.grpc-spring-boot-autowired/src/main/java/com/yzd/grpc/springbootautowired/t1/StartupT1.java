package com.yzd.grpc.springbootautowired.t1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 最终放进Spring容器的，必须是代理对象，而不是原先的对象
 * BeanPostProcessor —— 连接Spring IOC和AOP的桥梁
 * https://zhuanlan.zhihu.com/p/38208324
 * @Author: yaozh
 * @Description:
 */
@Slf4j
@SpringBootApplication
public class StartupT1 {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(StartupT1.class, args);
        Bean4BBP bean = applicationContext.getBean(Bean4BBP.class);

        System.out.println(bean.getName());
    }
}