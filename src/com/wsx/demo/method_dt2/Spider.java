package com.wsx.demo.method_dt2;

public class Spider extends Animal {
	// Spider子类
	public static void main(String[] args) {
		Spider spider = new Spider();
		System.out.println("Spider legs: " + spider.legs);
		spider.eat();
	}
	
	// 抽象方法中的eat方法
	public void eat() {
		System.out.println("Spider eat fly");
	}

	public Spider() {
		// 抽象类中的构造器，形参为腿数
		super(8);
	}
}
