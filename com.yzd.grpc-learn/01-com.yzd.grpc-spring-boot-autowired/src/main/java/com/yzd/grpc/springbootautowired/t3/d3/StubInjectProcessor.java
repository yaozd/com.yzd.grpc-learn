package com.yzd.grpc.springbootautowired.t3.d3;

import com.yzd.grpc.springbootautowired.t3.d3.config.Channel;
import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @Author: yaozh
 * @Description:
 */
@Component
public class StubInjectProcessor implements BeanDefinitionRegistryPostProcessor, BeanPostProcessor {

    private Map<String, Channel> channelMap;

    @SneakyThrows
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> targetCls = bean.getClass();
        Field[] targetFld = targetCls.getDeclaredFields();
        for (Field field : targetFld) {
            //找到制定目标的注解类
            if (field.isAnnotationPresent(StubInjected.class)) {
                field.setAccessible(true);
                StubInjected annotation = field.getAnnotation(StubInjected.class);
                String value = annotation.channel();
                System.out.println("StubInjected channel:"+value);
                Channel channel = channelMap.get(value);
                //1.直接调用
                //field.set(bean,BlockingStub.newBlockingStub(channel));
                //2.通过静态方法反射调用
                Class<?> stubClass = field.getType();
                String stubClassName = stubClass.getSimpleName();
                if (stubClassName.endsWith("Stub")) {
                    System.out.println("Stub true:"+stubClass);
                }
                Method method = stubClass.getMethod("newBlockingStub", Channel.class);
                Object newBlockingStubObj = method.invoke(null, channel);
                //每个字段的对象是独立，可独立设置超时时间
                field.set(bean,newBlockingStubObj);
            }
        }
        //region 暂时没有用
        if (bean instanceof BlockingStub) {
            //此处可以重新调整bean
            System.out.println(bean);
            Channel channel = channelMap.get("channel01");
            BlockingStub blockingStub = BlockingStub.newBlockingStub();
            blockingStub.setName("hello xiao ming");
            return blockingStub;
        }
        //endregion
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    /**
     * 简单grpc封装应该不需要动态注入bean
     * @param beanDefinitionRegistry
     * @throws BeansException
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        //暂时无用
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(BlockingStub.class);
        //动态注入bean
        String beanName = "blockingStub";
        if (!beanDefinitionRegistry.containsBeanDefinition(beanName)) {
            //beanDefinitionRegistry.registerBeanDefinition("blockingStub", rootBeanDefinition);
        }
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        //收集所有的channel配置
        this.channelMap = configurableListableBeanFactory.getBeansOfType(Channel.class);
    }
}