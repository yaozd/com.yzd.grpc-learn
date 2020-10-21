# spring bean
> 最终放进Spring容器的，必须是代理对象，而不是原先的对象

## 模拟实现spring boot简版Grpc封装
```
测试入口：
com.yzd.grpc.springbootautowired.t3.d3._StartupT3ForD3
2.
服务发现|地址解析参考：
https://github.com/fang-yan-peng/sq-grpc
PS:百度云备份
```


## 深入理解spring生命周期
- [springboot之BeanPostProcessor功能及例子](https://xiejun.blog.csdn.net/article/details/87957540)
- [深入理解spring生命周期与BeanPostProcessor的实现原理](https://blog.csdn.net/varyall/article/details/82257202)

## 代理拦截方法
- [SpringBoot实践-BeanPostProcessor的作用和妙用](https://www.jianshu.com/p/6a48675ef7a3) 示例：t2

## Java的三种代理模式(Spring动态代理对象)
- [Java的三种代理模式(Spring动态代理对象)](https://www.cnblogs.com/qlqwjy/p/7550609.html)

## 动态代理对象，并动态注入到spring容器中
- [创建动态代理对象bean，并动态注入到spring容器中](https://blog.csdn.net/lichuangcsdn/article/details/89694363)
- [动态代理接口并注册到spring容器](https://blog.csdn.net/sz85850597/article/details/78906858)
- [Spring BPP中如何优雅的创建动态代理Bean详解](https://www.jb51.net/article/157261.htm)

## 参考引用-反射工具
- [Java Field.set()向对象的这个Field属性设置新值value](http://www.51gjie.com/java/794.html)
- [Java 反射调用静态方法](https://www.itdaan.com/blog/2015/01/08/b02f5e1707761c74f23716b9d7df708c.html)
- 高效的反射工具包
    - [Java高性能反射工具包ReflectASM](https://www.cnblogs.com/juetoushan/p/7724793.html) 推荐
# grpc 封装
- [https://github.com/fang-yan-peng/sq-grpc](https://github.com/fang-yan-peng/sq-grpc) 推荐参考