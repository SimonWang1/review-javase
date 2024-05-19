package com.wsx.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理共用一套逻辑，自动生成运行于jvm的代理类，复用性很好
 *
 */
public class Client2 {

    public static void main(String[] args) {

        /*String name = "sun.misc.ProxyGenerator.saveGeneratedFiles";
        System.setProperty(name, "true");
        //拿系统变量
        String value = System.getProperty(name);
        System.out.println(value);*/

        // 目标接口引用指向目标实现
        BaseTargetInterface baseTargetInterface = new TargetInterfaceImpl();

        // 创建调用处理类，初始化目标实现逻辑
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler(baseTargetInterface);

        // 代理类 $Proxy0.class
        Object object = Proxy.newProxyInstance( // 动态代理壳子 使用Proxy反射生成运行于jvm的$Proxy0.class
                                Client2.class.getClassLoader(), // 当前类的class loader 可能用于跑代理类
                                new Class<?>[] {TargetInterface.class, TargetInterface2.class}, // 目标接口数组
                                proxyInvocationHandler); // 调用处理类

        // $Proxy0是对目标接口实现类的增强，可以强转成接口调用方法
        TargetInterface targetInterface = ((TargetInterface) object);
        // $Proxy0调用方法时进入调用处理类的invoke方法，执行增强拓展逻辑，封装接口名和方法名到method反射对象->参数m1,m2
        targetInterface.sayHi();
        // 强转接口多实现
        TargetInterface2 targetInterface2 = ((TargetInterface2) object);
        targetInterface2.sayHi2();
    }
}

