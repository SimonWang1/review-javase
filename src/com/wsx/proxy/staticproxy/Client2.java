package com.wsx.proxy.staticproxy;

public class Client2 {

    public static void main(String[] args) {
        // Ŀ��ӿ�����ָ��Ŀ��ʵ��
        TargetInterface targetInterface = new TargetInterfaceImpl();
        // ���������࣬��ʼ��Ŀ��ʵ���߼�
        ProxyClass proxyClass = new ProxyClass(targetInterface);
        proxyClass.sayHi();
    }
}
