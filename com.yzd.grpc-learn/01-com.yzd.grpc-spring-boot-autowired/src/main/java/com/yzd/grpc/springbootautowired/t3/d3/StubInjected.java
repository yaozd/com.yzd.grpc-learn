package com.yzd.grpc.springbootautowired.t3.d3;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 通过自定义的注解，将字段进行初始话
 * @Author: yaozh
 * @Description:
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface StubInjected {
    //String channel() default "";
    //必填字段，必须配置channel
    String channel();
}
