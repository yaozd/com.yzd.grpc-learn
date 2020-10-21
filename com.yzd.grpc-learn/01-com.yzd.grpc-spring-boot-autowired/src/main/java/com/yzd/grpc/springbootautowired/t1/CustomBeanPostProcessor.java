package com.yzd.grpc.springbootautowired.t1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: yaozh
 * @Description:
 */
@Slf4j
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {


    public CustomBeanPostProcessor() {
        log.info("construct CustomBeanPostProcessor");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Bean4BBP) {
            log.info("process bean before initialization-实例初始化前");
            Bean4BBP bean4BBP = new Bean4BBP();
            bean4BBP.setName("yao");
            return bean4BBP;
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Bean4BBP) {
            log.info("process bean after initialization-实例初始化后");
        }
        return bean;
    }
}
