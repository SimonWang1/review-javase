package com.wsx.demo;

public abstract class Animal {
	protected int legs;
	public abstract void eat();
	
	public void walk() {
		System.out.println("used " + this.legs + " legs walking");
	}
	
	protected Animal(int legs) {
		this.legs = legs;
	}
}
