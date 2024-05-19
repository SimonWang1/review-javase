package com.wsx.proxy.staticproxy;

/**
 * 代理类，实现目标接口
 *
 */
public class ProxyClass implements TargetInterface {
    // 目标接口的引用
    private final TargetInterface targetInterface;

    // 创建时初始化，包含目标实现的逻辑
    public ProxyClass(TargetInterface targetInterface) {
        this.targetInterface = targetInterface;
    }

    @Override
    public void sayHi() {
        // 对目标接口进行增强
        System.out.println("功能增强前..........");

        // 真正干活还是目标实现的sayHi方法
        targetInterface.sayHi();
        // System.out.println("ProxyClass sayHi..........");

        System.out.println("功能增强后..........");
    }

}
