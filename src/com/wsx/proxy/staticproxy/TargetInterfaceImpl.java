package com.wsx.proxy.staticproxy;

/**
 * Ŀ��ʵ��
 *
 */
public class TargetInterfaceImpl implements TargetInterface {

    @Override
    public void sayHi() {
        System.out.println("TargetClassImpl sayHi..........");
    }
}
