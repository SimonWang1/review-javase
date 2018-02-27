package com.wsx.demo.chapter5;

public class StaticAccessNonStatic {
	// 静态访问非静态方法
	public void info() {
		System.out.println("简单的info方法");
	}

	public static void main(String[] args) {
		// 通过new关键字调用构造器创建对象，访问静态方法
		new StaticAccessNonStatic().info();
	}
}
