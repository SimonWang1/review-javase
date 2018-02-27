package com.wsx.demo.chapter5_1;

class BaseClass {
	// 父类
	public int a = 5;
}

public class SubClass extends BaseClass{
	// super访问父类属性
	// 子类重写父类属性a
	public int a = 7;
	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.accessOwner();
		sc.accessBase();
		System.out.println("----------");
		// 子类引用指向子类对象没有多态，访问子类属性
		System.out.println(sc.a);
		// 父类引用指向子类对象发生多态，访问父类属性
		BaseClass bc = new SubClass();
		System.out.println(bc.a);
	}
	
	public void accessOwner() {
		System.out.println(a);
	}
	
	public void accessBase() {
		// 通过super关键字访问父类属性a
		System.out.println(super.a);
	}
}
