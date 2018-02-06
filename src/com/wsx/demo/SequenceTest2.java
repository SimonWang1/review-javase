package com.wsx.demo;

public class SequenceTest2 {
	// 执行顺序
	static int a = 1;
	static {
		// 重新赋值父类全局变量
		a = 10;
		System.out.println("parent static code");
	}

	public static void main(String[] args) {
		System.out.println("***************");
		// 在继承父类或子类中创建对象，优先执行父子类静态代码块再执行主方法内容
		// 创建对象的执行顺序依次为（父类→子类）静态代码块，无参构造器
		SequenceTest2 parent = new Child();
		// 通过toString方法打印父类引用，引用在栈内存中储存地址，消除未引用异常
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
		// 重新赋值子类全局变量的值
		a = 20;
		System.out.println("child static code");
	}

	public Child() {
		System.out.println("child constrator");
		System.out.println("Child a = " + a);
	}
}
