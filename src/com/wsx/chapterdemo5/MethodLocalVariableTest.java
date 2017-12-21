package com.wsx.chapterdemo5;

public class MethodLocalVariableTest {
	public static void main(String[] args) {
		//定义方法局部变量a
		int a;
		//
//		System.out.println("方法局部变量a的值" + a);
		a = 5;
		//局部变量存储在栈中需要指向堆内存即赋值操作，否则抛出未初始化异常
		System.out.println("方法局部变量a的值" + a);
	}
}
