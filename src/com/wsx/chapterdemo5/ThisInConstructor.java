package com.wsx.chapterdemo5;

public class ThisInConstructor {
	//定义foo成员变量
	public int foo;
	public ThisInConstructor() {
		//在构造器中给foo变量赋值
		this.foo = 6;
	}
	public static void main(String[] args) {
		//取值
		System.out.println(new ThisInConstructor().foo);
	}
}
