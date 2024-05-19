package com.wsx.proxy.staticproxy;

public class Client2 {

    public static void main(String[] args) {
        // 目标接口引用指向目标实现
        TargetInterface targetInterface = new TargetInterfaceImpl();
        // 创建代理类，初始化目标实现逻辑
        ProxyClass proxyClass = new ProxyClass(targetInterface);
        proxyClass.sayHi();
    }
}
