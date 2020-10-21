package com.yzd.grpc.springbootautowired.t2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: yaozh
 * @Description:
 */
@Slf4j
@Service
public class HelloServiceTest {

    @RountingInjected
    HelloService helloService;

    public void testSayHello() {
        log.info("step_1:helloService.sayHello()");
        helloService.sayHello();
    }
}
