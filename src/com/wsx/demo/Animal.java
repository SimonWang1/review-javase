package com.wsx.demo;

public abstract class Animal {
	protected int legs;
	public abstract void eat();
	
	public void walk() {
		System.out.println("使用" + this.legs + "腿行走");
	}
	
	protected Animal(int legs) {
		this.legs = legs;
	}
}
