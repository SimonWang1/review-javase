package com.wsx.proxy.dynamicproxy;

public class Client1 {

    public static void main(String[] args) {
        // 单接口实现对象
        TargetInterface targetInterface = new TargetInterfaceImpl();
        targetInterface.sayHi();
    }
}
