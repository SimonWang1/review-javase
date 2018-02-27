package com.wsx.demo.chapter5;

public class DogTest {
	// 方法内部调用测试
	public static void main(String[] args) {
		Dog dog = new Dog();
		// 调用Dog对象的run方法，run方法包含jump方法
		dog.run();
	}
}
