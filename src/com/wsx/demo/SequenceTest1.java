package com.wsx.demo;

class Root {
	static {
		System.out.println("Root的静态初始化块");
	}
	{
		System.out.println("Root的普通初始化块");
	}

	public Root() {
		System.out.println("Root的无参构造器");
	}
}

class Mid extends Root {
	static {
		System.out.println("Mid的静态初始化快");
	}
	{
		System.out.println("Mid的普通初始化块");
	}

	public Mid(String msg) {
		// 通过this调用同一类中重载的构造器
		this();
		System.out.println("Mid的带参构造器，参数值为：" + msg);
	}

	public Mid() {
		System.out.println("Mid的无参构造器");
	}
}

class Leaf extends Mid {
	static {
		System.out.println("Leaf的静态初始化块");
	}
	{
		System.out.println("Leaf的普通初始化块");
	}

	public Leaf() {
		// 通过super调用父类中有一个字符串参数的构造器
		super("Java编程思想");
		System.out.println("Leaf的无参构造器");
	}
}

public class SequenceTest1 {
	public static void main(String[] args) {
		// 在无继承关系的方法中创建对象，主方法内容执行顺序不变
		// 创建对象的执行顺序依次为（父类→子类）静态代码块，普通初始化块，无参构造器，带参构造器
		new Leaf();
		System.out.println("********************");
		// 静态代码块仅执行一次
		new Leaf();
	}
}
