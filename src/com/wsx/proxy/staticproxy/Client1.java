package com.wsx.proxy.staticproxy;

public class Client1 {

    public static void main(String[] args) {
        TargetInterface targetInterface = new TargetInterfaceImpl();
        targetInterface.sayHi();
    }
}
