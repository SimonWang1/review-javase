package com.wsx.demo.chapter5_1;

class Root {
	// 间接父类
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
	// 父类
	static {
		System.out.println("Mid的静态初始化快");
	}
	
	{
		System.out.println("Mid的普通初始化块");
	}

	public Mid(String msg) {
		// 调用重载构造器
		this();
		System.out.println("Mid的带参构造器，参数值为：" + msg);
	}

	public Mid() {
		System.out.println("Mid的无参构造器");
	}
}

class Leaf extends Mid {
	// 子类
	static {
		System.out.println("Leaf的静态初始化块");
	}
	
	{
		System.out.println("Leaf的普通初始化块");
	}

	public Leaf() {
		// 调用父类带参构造器
		super("Java编程思想");
		System.out.println("Leaf的无参构造器");
	}
}

public class SequenceTest1 {
	// 执行顺序
	public static void main(String[] args) {
		// 执行顺序从上到下优先执行静态代码块，再依次执行普通初始化块，无参构造器，带参构造器
		new Leaf();
		System.out.println("********************");
		// 静态代码块仅执行一次
		new Leaf();
	}
}
