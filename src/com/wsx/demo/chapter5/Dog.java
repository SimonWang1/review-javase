package com.wsx.demo.chapter5;

public class Dog {
	// 方法内部调用
	public void jump() {
		System.out.println("正在执行jump方法");
	}

	// 定义run()方法，run()方法包含jump()方法
	public void run() {
		// Dog d = new Dog();
		// d.jump();
		// 使用this引用调用run()方法的对象
		// this.jump();
		// 直接写成
		jump();
		System.out.println("正在执行run方法");
	}
}
