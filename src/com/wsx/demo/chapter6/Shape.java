package com.wsx.demo.chapter6;

public abstract class Shape {
	// 形状抽象类
	{
		System.out.println("进行Shape的初始化块");
	}

	private String color;

	// 周长抽象方法
	public abstract double calPerimeter();

	// 形状抽象方法
	public abstract String getType();
	
	// color set、get方法
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	// 带参构造器
	public Shape(String color) {
		System.out.println("执行Shape构造器...");
		this.color = color;
	}

	public Shape() {
		
	}
}
