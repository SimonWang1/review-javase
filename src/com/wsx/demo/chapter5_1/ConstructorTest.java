package com.wsx.demo.chapter5_1;

public class ConstructorTest {
	// 带参构造器
	public String name;
	public int count;

	public static void main(String[] args) {
		// 使用自定义构造器创建对象
		ConstructorTest tc = new ConstructorTest("深入理解计算机原理", 3999);
		System.out.println(tc.name);
		System.out.println(tc.count);
	}

	// 提供两个参数的构造器
	public ConstructorTest(String name, int count) {
		// 构造器中的this代表初始化对象
		this.name = name;
		this.count = count;
	}
}
