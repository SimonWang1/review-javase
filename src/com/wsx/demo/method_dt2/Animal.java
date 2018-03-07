package com.wsx.demo.method_dt2;

public abstract class Animal {
	// 动物抽象类
	// 声明protected的属性用于被子类重写
	protected int legs;

	// 抽象方法用于被重写
	public abstract void eat();

	public void walk() {
		System.out.println("used " + this.legs + " legs walking");
	}

	// 声明protected的构造器用于被子类调用重写
	protected Animal(int legs) {
		this.legs = legs;
	}
}
