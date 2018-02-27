package com.wsx.demo.chapter5_1;

public class StaticInitTest {
	// 静态代码块
	static {
		// 静态代码块优先执行将a静态成员变量赋值为6
		a = 6;
	}
	// 再将a静态成员变量赋值为9
	static int a = 9;

	public static void main(String[] args) {
		System.out.println(StaticInitTest.a);
	}
}
