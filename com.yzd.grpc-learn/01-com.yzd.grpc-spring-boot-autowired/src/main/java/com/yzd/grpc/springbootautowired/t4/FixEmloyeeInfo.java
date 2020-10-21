package com.yzd.grpc.springbootautowired.t4;

/**
 * 定义代理目标接口（JDk动态代理不能代理类，只能基于接口实现）
 * @Author: yaozh
 * @Description:
 */
public interface FixEmloyeeInfo {
    Integer FixEmployeeInfo(Integer age);
}
