package com.wsx.demo.method_dt2;

public class Fish extends Animal implements Pet{
	// Fish实现类
	private String name;
	public static void main(String[] args) {
		Fish gf = new Fish();
		gf.setName("Golden fish");
		System.out.printf("Fish name: " + gf.getName()
				+ "%nFish leg: " + gf.legs + "%n");
		gf.eat();
		gf.play();
		// 抽象类中普通方法
		gf.walk();
	}
	
	// 接口中的set、get方法
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void walk() {
		System.out.println("Fish swimming, no legs");
	}
	
	// 抽象方法中的eat方法
	public void eat() {
		System.out.println("Eat fish food");
	}
	
	// 接口中的play方法
	public void play() {
		System.out.println("Free swimming");
	}
	
	public Fish() {
		// 抽象类中的构造器，形参为腿数
		super(0);
	}
}
