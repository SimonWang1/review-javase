package com.wsx.demo.chapter5_1;

class BaseClass {
	public int a = 5;
}

public class SubClass extends BaseClass{
	//子类覆盖父类属性a
	public int a = 7;
	public void accessOwner() {
		System.out.println(a);
	}
	
	public void accessBase() {
		//通过super关键字访问父类属性a
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.accessOwner();
		sc.accessBase();
	}
}
