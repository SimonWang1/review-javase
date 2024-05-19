package com.wsx.proxy.staticproxy;

/**
 * �����࣬ʵ��Ŀ��ӿ�
 *
 */
public class ProxyClass implements TargetInterface {
    // Ŀ��ӿڵ�����
    private final TargetInterface targetInterface;

    // ����ʱ��ʼ��������Ŀ��ʵ�ֵ��߼�
    public ProxyClass(TargetInterface targetInterface) {
        this.targetInterface = targetInterface;
    }

    @Override
    public void sayHi() {
        // ��Ŀ��ӿڽ�����ǿ
        System.out.println("������ǿǰ..........");

        // �����ɻ��Ŀ��ʵ�ֵ�sayHi����
        targetInterface.sayHi();
        // System.out.println("ProxyClass sayHi..........");

        System.out.println("������ǿ��..........");
    }

}
