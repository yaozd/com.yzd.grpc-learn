package com.yzd.grpc.springbootautowired.t2;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @Author: yaozh
 * @Description:
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface RountingInjected {
    String value() default "helloServiceImpl1";
}
