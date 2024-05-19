package com.wsx.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ���ô�����
 */
public class ProxyInvocationHandler implements InvocationHandler {
    // Ŀ��ӿڵ�obj����
    private final Object target;

    /**
     * ����ʱ��ʼ��Ŀ��ʵ���߼�
     *
     * @param target Ŀ��ӿ�����
     */
    public ProxyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * ��̬������÷��� ��Ŀ��ʵ�ַ�������ǿ��չ
     *
     * @param proxy Proxy���䴴����$xxx.class���������
     * @param method ������ǿתĿ��ӿڵķ������ ���ڷ������Ŀ��ʵ�ַ���
     * @param args �����෽������
     * @return ��̬���������ؽ��
     * @throws Throwable �쳣
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // ��Ŀ��ʵ�ֽ�����ǿ
        System.out.println("������ǿǰ..........");

        // �����ɻ��Ŀ��ʵ�ֵķ��� TargetInterfaceImpl
        Object object = method.invoke(target, args);

        System.out.println("������ǿ��..........");

        return object;
    }
}