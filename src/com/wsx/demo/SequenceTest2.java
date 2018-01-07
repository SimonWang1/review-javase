package com.wsx.demo;

public class SequenceTest2 {
	 static int a = 1;
	 {
		a =  10;
		System.out.println("parent static code");
	}
	
	public static void main(String[] args) {
		System.out.println("***************");
		//存在多态时先调用子类静态代码块，再顺序执行主方法内容
		//声明父类引用类型时先调用父类静态代码块，再执行子类构造器
		SequenceTest2 parent = new Child();
		//通过toString方法打印父类引用，指向子类构造器，消除未引用异常
		System.out.println(parent.toString());
	}
	
	public SequenceTest2(){
		System.out.println("parent constractor");
		System.out.println("Parent a = " + a);
	}
}
	
class Child extends SequenceTest2{
	 static int a = 2;
	 static {
		a = 20;
		System.out.println("child static code");
	}
	
	public Child(){
		System.out.println("child constrator");
		System.out.println("Child a = " + a);
	}
}
