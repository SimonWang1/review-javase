package com.wsx.demo.chapter5_1;

public class StaticInitTest {
	// 静态代码块
	static {
		// 优先执行
		a = 6;
	}
	
	// 将全局变量a赋值为9
	static int a = 9;

	public static void main(String[] args) {
		System.out.println(StaticInitTest.a);
	}
}
