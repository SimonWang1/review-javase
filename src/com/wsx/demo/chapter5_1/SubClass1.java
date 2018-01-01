package com.wsx.demo.chapter5_1;

class BaseClass1{
	public int book = 6;
	public void base() {
		System.out.println("父类的普通方法");
	}
	
	public void test() {
		System.out.println("父类被覆盖的方法");
	}
}

public class SubClass1 extends BaseClass1{
	public static void main(String[] args) {
		//父子类单独创建实例没有多态
		BaseClass1 bc = new BaseClass1();
		System.out.println(bc.book);
		bc.base();
		bc.test();
		SubClass1 sc = new SubClass1();
		System.out.println(sc.book);
		sc.base();
		sc.test();
		//编译时类型为父类，运行时类型为子类，可能出现多态
		BaseClass1 ploymophicBc = new SubClass1();
		//访问父类实例变量
		System.out.println(ploymophicBc.book);
		//执行父类base()方法
		ploymophicBc.base();
		//父子类都有的方法执行子类的test()方法
		ploymophicBc.test();
		//不能执行父类没有的方法
//		ploymophicBc.sub();
	}

	public String book = "Java编程思想";
	public void test() {
		System.out.println("子类覆盖父类的方法");
	}
	
	public void sub() {
		System.out.println("子类的普通方法");
	}
}
