package com.wsx.demo.chapter5;

public class ThisInConstructor {
	// 构造器中的this
	// 声明全局变量
	public int foo;

	public ThisInConstructor() {
		// 在构造器中赋值，this表示当前类
		this.foo = 6;
	}

	public static void main(String[] args) {
		System.out.println(new ThisInConstructor().foo);
	}
}
