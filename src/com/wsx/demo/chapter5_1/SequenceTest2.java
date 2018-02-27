package com.wsx.demo.chapter5_1;

public class SequenceTest2 {
	// 执行顺序
	static int a = 1;
	static {
		a = 10;
		System.out.println("parent static code");
	}

	public static void main(String[] args) {
		// 从上到下优先执行静态代码块
		System.out.println("***************");
		// 依次执行无参构造器
		SequenceTest2 parent = new Child();
		// 打印父类引用，在栈内存中存储堆内存地址，消除未引用异常
		System.out.println(parent.toString());
	}

	public SequenceTest2() {
		System.out.println("parent constractor");
		System.out.println("Parent a = " + a);
	}
}

class Child extends SequenceTest2 {
	static int a = 2;
	static {
		a = 20;
		System.out.println("child static code");
	}

	public Child() {
		System.out.println("child constrator");
		System.out.println("Child a = " + a);
	}
}
