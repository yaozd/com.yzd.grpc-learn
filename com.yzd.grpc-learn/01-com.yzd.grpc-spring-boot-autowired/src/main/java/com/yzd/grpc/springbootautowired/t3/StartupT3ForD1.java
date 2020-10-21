package com.yzd.grpc.springbootautowired.t3;

import com.yzd.grpc.springbootautowired.t3.d1.ProxyFactory;
import com.yzd.grpc.springbootautowired.t3.d1.UserDao;

/**
 * Cglib动态代理实现
 * Cglib的底层是调用ASM来实现动态链接的,所以性能方便会比Java原生的Proxy的性能提升很多
 * Java的三种代理模式(Spring动态代理对象)
 * https://www.cnblogs.com/qlqwjy/p/7550609.html
 * @Author: yaozh
 * @Description:
 */
public class StartupT3ForD1 {
    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();

        //代理对象
        UserDao proxy = (UserDao)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();
    }
}
