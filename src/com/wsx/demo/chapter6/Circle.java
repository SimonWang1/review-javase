package com.wsx.demo.chapter6;

public class Circle extends Shape{
	private double radius;
	public static void main(String[] args) {
		Shape s1 = new Triangle("Black", 3, 4, 5);
		Shape s2 = new Circle("Yellow", 3);
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter());
	}
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//重写计算周长的抽象方法
	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

	//重写Shape类返回形状的抽象方法
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return getColor() + " Circle";
	}
}
