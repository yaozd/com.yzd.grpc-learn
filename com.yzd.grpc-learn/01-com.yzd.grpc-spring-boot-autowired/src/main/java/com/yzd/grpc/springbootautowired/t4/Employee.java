package com.yzd.grpc.springbootautowired.t4;

/**
 * @Author: yaozh
 * @Description:
 */
public class Employee implements FixEmloyeeInfo {
    @Override
    public Integer FixEmployeeInfo(Integer age) {
        System.out.println("执行  FixEmployeeInfo()");
        return age + 1;
    }
}
