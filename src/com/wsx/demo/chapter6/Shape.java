package com.wsx.demo.chapter6;

public abstract class Shape {
	{
			System.out.println("进行Shape的初始化块");
	}
	
	private String color;
	//定义计算周长的抽象方法
	public abstract double calPerimeter();
	//定义返回形状的抽象方法
	public abstract String getType();
	//定义Shape构造器，该构造器不是用于创建Shape对象而是用于被子类调用
	public Shape() {
		
	}
	
	public Shape(String color) {
		System.out.println("执行Shape构造器...");
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
