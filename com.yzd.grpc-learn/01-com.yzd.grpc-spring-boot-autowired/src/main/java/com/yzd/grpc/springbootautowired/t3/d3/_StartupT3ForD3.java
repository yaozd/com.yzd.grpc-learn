package com.yzd.grpc.springbootautowired.t3.d3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Todo 模拟实现简版Grpc封装
 * [https://github.com/fang-yan-peng/sq-grpc](https://github.com/fang-yan-peng/sq-grpc)
 * @Author: yaozh
 * @Description:
 */

@Slf4j
@SpringBootApplication
public class _StartupT3ForD3 {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext applicationContext = SpringApplication.run(_StartupT3ForD3.class, args)) {
            BlockingStubTest blockingStubTest = applicationContext.getBean(BlockingStubTest.class);
            blockingStubTest.save();
        }
    }
}