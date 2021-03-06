package com.wsx.demo.chapter5_1;

public class Person1 {
	// 初始化块
	{
		// 定义初始化块，优先于构造器执行，只需定义一个
		int a = 6;
		if (a > 4) {
			System.out.println("Person初始化块，局部变量a的值大于4");
		}
		System.out.println("Person的初始化块");
	}
	{
		// 定义第二个初始化块，与在同一代码块执行效果相同
		System.out.println("第二个初始化块");
	}

	public static void main(String[] args) {
		// 通过new关键字调用构造器创建对象
		new Person1();
	}

	// 定义无参构造器
	public Person1() {
		System.out.println("Person1类的无参构造器");
	}
}
