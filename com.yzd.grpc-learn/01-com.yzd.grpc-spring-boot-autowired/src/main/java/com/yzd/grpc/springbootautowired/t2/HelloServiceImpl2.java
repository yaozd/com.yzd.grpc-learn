package com.yzd.grpc.springbootautowired.t2;

import org.springframework.stereotype.Service;

/**
 * @Author: yaozh
 * @Description:
 */
@Service
public class HelloServiceImpl2 implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("你好我是HelloServiceImpl2");
    }
}
