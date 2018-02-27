package com.wsx.demo.chapter5_1;

class Fruit {
	// 父类
	public double weight;

	public void info() {
		System.out.println("I'm a fruit! my weight is " + weight + "g");
	}
}

public class Apple extends Fruit {
	// 子类通过extends关键字调用父类的属性和方法
	public static void main(String[] args) {
		Apple a = new Apple();
		a.weight = 45;
		a.info();
	}
}
