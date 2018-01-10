package com.wsx.demo;

public class Spider extends Animal{
	public void eat() {
		System.out.println("Spider eat");
	}
	//使用super关键字在当前类构造其中赋值腿数
	public Spider() {
		super(8);
	}
}
