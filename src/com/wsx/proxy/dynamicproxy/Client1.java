package com.wsx.proxy.dynamicproxy;

public class Client1 {

    public static void main(String[] args) {
        // ���ӿ�ʵ�ֶ���
        TargetInterface targetInterface = new TargetInterfaceImpl();
        targetInterface.sayHi();
    }
}
