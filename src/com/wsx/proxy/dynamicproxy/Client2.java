package com.wsx.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * ��̬������һ���߼����Զ�����������jvm�Ĵ����࣬�����Ժܺ�
 *
 */
public class Client2 {

    public static void main(String[] args) {

        /*String name = "sun.misc.ProxyGenerator.saveGeneratedFiles";
        System.setProperty(name, "true");
        //��ϵͳ����
        String value = System.getProperty(name);
        System.out.println(value);*/

        // Ŀ��ӿ�����ָ��Ŀ��ʵ��
        BaseTargetInterface baseTargetInterface = new TargetInterfaceImpl();

        // �������ô����࣬��ʼ��Ŀ��ʵ���߼�
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler(baseTargetInterface);

        // ������ $Proxy0.class
        Object object = Proxy.newProxyInstance( // ��̬������� ʹ��Proxy��������������jvm��$Proxy0.class
                                Client2.class.getClassLoader(), // ��ǰ���class loader ���������ܴ�����
                                new Class<?>[] {TargetInterface.class, TargetInterface2.class}, // Ŀ��ӿ�����
                                proxyInvocationHandler); // ���ô�����

        // $Proxy0�Ƕ�Ŀ��ӿ�ʵ�������ǿ������ǿת�ɽӿڵ��÷���
        TargetInterface targetInterface = ((TargetInterface) object);
        // $Proxy0���÷���ʱ������ô������invoke������ִ����ǿ��չ�߼�����װ�ӿ����ͷ�������method�������->����m1,m2
        targetInterface.sayHi();
        // ǿת�ӿڶ�ʵ��
        TargetInterface2 targetInterface2 = ((TargetInterface2) object);
        targetInterface2.sayHi2();
    }
}

