package com.wsx.demo.chapter5;

class Person1 {
	// 全局变量存储在堆中加载时自动初始化赋值实例变量与静态变量
	// 实例变量
	public String name;
	// 静态变量
	public static int eyeNum;
}

public class PersonTest1 {
	public static void main(String[] args) {
		System.out.println("Person的eyeNum静态变量值：" + Person1.eyeNum);
		Person1 p = new Person1();
		System.out.println("p变量的name变量值是：" + p.name);
	}
}
