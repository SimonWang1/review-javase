package com.wsx.chapterdemo5;

public class MethodLocalVariableTest {
	public static void main(String[] args) {
		//定义方法局部变量a
		int a;
		//
//		System.out.println("方法局部变量a的值" + a);
		a = 5;
		//需赋值再取数，否则抛出未初始化异常
		System.out.println("方法局部变量a的值" + a);
	}
}
