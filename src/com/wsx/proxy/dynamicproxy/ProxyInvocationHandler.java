package com.wsx.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 调用处理类
 */
public class ProxyInvocationHandler implements InvocationHandler {
    // 目标接口的obj引用
    private final Object target;

    /**
     * 创建时初始化目标实现逻辑
     *
     * @param target 目标接口引用
     */
    public ProxyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 动态代理调用方法 对目标实现方法的增强拓展
     *
     * @param proxy Proxy反射创建的$xxx.class代理类对象
     * @param method 代理类强转目标接口的反射对象 用于反射调用目标实现方法
     * @param args 代理类方法参数
     * @return 动态代理方法返回结果
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 对目标实现进行增强
        System.out.println("功能增强前..........");

        // 真正干活还是目标实现的方法 TargetInterfaceImpl
        Object object = method.invoke(target, args);

        System.out.println("功能增强后..........");

        return object;
    }
}