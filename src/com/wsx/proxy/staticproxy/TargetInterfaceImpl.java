package com.wsx.proxy.staticproxy;

/**
 * 目标实现
 *
 */
public class TargetInterfaceImpl implements TargetInterface {

    @Override
    public void sayHi() {
        System.out.println("TargetClassImpl sayHi..........");
    }
}
