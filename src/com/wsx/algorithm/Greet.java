package com.wsx.algorithm;

public class Greet {
	// 调用栈，用于存储多个函数的变量
	public static void main(String[] args) {
		// 调用函数greet，在站内存分配空间
		greet("jackson");
	}

	public static void greet(String name) {
		// 按照函数顺序执行
		System.out.println("hello, " + name + "!");
		// 调用greet2函数，此时greet处于挂起状态
		greet2(name);
		// 回到greet，打印输出
		System.out.println("getting ready to say bye...");
		// 调用bye函数，挂起greet
		bye();
		// 无函数调用，从函数返回
	}

	public static void greet2(String name) {
		System.out.println("how are you, " + name + "?");
	}

	public static void bye() {
		System.out.println("ok, bye! ");
	}
}
