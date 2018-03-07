package com.wsx.demo.method_dt2;

public class Cat extends Animal implements Pet{
	// Cat实现类
	private String name;
	public static void main(String[] args) {
		Cat xh = new Cat();
		xh.setName("Mimi");
		System.out.printf("Cat name: " + xh.getName()
				+ "%nCat legs: " + xh.legs + "%n");
		xh.eat();
		xh.play();
		// 抽象类中普通方法
		xh.walk();
	}
	
	// 接口中的set、get方法
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	// 抽象方法中的eat方法
	public void eat() {
		System.out.println("Cat eat fish");
	}

	// 接口中的play方法
	public void play() {
		System.out.println("Cat teaser stick");
	}
	
	public Cat() {
		// 抽象类中的构造器，形参为腿数
		super(4);
	}
}
