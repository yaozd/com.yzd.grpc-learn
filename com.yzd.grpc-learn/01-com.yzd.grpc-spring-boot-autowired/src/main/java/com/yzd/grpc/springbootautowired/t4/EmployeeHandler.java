package com.yzd.grpc.springbootautowired.t4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 定义扩展处理类
 * @Author: yaozh
 * @Description:
 */


public class EmployeeHandler implements InvocationHandler {
    private Object target;
    public EmployeeHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return method.invoke(target , args);
    }
}