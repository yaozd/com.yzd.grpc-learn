package com.yzd.grpc.springbootautowired.t4;


import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDk动态代理
 * 静态代理、动态代理、CGLIB代理实现及原理
 * https://blog.csdn.net/qq_41285600/article/details/90742815
 * @Author: yaozh
 * @Description:
 */
public class StartupT4 {
    public static void main(String[] args) {
        FixEmloyeeInfo employee = (FixEmloyeeInfo) Proxy.newProxyInstance(Employee.class.getClassLoader(), Employee.class.getInterfaces(), new EmployeeHandler(new Employee()));
        employee.FixEmployeeInfo(23);
        System.out.println("代理类名：  " + employee.getClass().getName());
        Method[] methods = employee.getClass().getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

    }
}
