package com.wsx.algorithm;

// 调用栈
public class Greet {
	public static void main(String[] args) {
		// 调用greet方法，在栈帧存储局部变量
		greet("jackson");
	}

	public static void greet(String name) {
		// 顺序执行
		System.out.println("hello, " + name + "!");
		// 调用greet2方法，此时greet处于挂起状态
		greet2(name);
		// 回到greet，打印输出
		System.out.println("getting ready to say bye...");
		// 调用bye方法，挂起greet
		bye();
		// return null
	}

	public static void greet2(String name) {
		System.out.println("how are you, " + name + "?");
	}

	public static void bye() {
		System.out.println("ok, bye! ");
	}
}
