package com.wsx.proxy.dynamicproxy;

/**
 * 目标实现接口1和2
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