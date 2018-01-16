package com.wsx.demo.method_dt2;

public class Spider extends Animal {
	public void eat() {
		System.out.println("Spider eat");
	}

	// 使用super关键字在构造器中赋值当前类的腿数
	public Spider() {
		super(8);
	}
}
