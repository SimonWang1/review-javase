package com.wsx.proxy.dynamicproxy;

/**
 * Ŀ��ʵ�ֽӿ�1��2
 *
 */
public class TargetInterfaceImpl implements TargetInterface, TargetInterface2 {

    @Override
    public void sayHi() {
        System.out.println("TargetClassImpl sayHi..........");
    }

    @Override
    public void sayHi2() {
        System.out.println("TargetClassImpl sayHi2..........");
    }
}