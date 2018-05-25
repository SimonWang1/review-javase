package com.wsx.demo.chapter5;

public class MethodLocalVariableTest {
	// 方法内的变量为局部变量，不能初始化
	public static void main(String[] args) {
		// 声明方法局部变量a
		int a;
		// System.out.println("方法局部变量a的值" + a);
		a = 5;
		// 局部变量存储在栈中，需要赋值操作否则报错
		System.out.println("方法局部变量a的值" + a);
	}
}
