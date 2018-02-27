package com.wsx.demo.chapter5_1;

class Animal1 {
	// 父类
	private void beat() {
		System.out.println("心脏跳动");
	}

	public void breath() {
		// 方法内部调用封装方法
		beat();
		System.out.println("吸气，吐气，呼吸...");
	}
}

class Bird1 extends Animal1 {
	// 继承Animal，直接复用父类的breath()方法
	public void fly() {
		System.out.println("我在天空自由飞翔...");
	}
}

class Wolf1 extends Animal1 {
	// 继承Animal，直接复用父类的breath()方法
	public void run() {
		System.out.println("我在陆地上快速奔跑...");
	}
}

public class InheritTest {
	// 使用继承让子类同时拥有父类的breath方法，实现代码复用的重要手段
	public static void main(String[] args) {
		// 父类引用指向子类对象时发生多态，不能访问子类特有的方法
		Animal1 bee = new Bird1();
		bee.breath();
		System.out.println("---------------------");
		// 子类引用指向子类对象时没有多态，可以访问子类所有方法
		Bird1 bird = new Bird1();
		bird.breath();
		bird.fly();
		Wolf1 grey = new Wolf1();
		grey.breath();
		grey.run();
	}
}
