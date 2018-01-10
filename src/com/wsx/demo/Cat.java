package com.wsx.demo;

public class Cat extends Animal implements Pet{
	private String name;
	public static void main(String[] args) {
		Cat xh = new Cat();
		xh.setName("Mimi");
		System.out.printf("Cat name: " + xh.getName()
				+ "%nCat legs: " + xh.legs + "%n");
		xh.walk();
		xh.eat();
		xh.play();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void eat() {
		System.out.println("Cat eat fish");
	}

	public void play() {
		System.out.println("Cat teaser stick");
	}
	
	public Cat() {
		super(4);
	}
}
