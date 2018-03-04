package com.wsx.demo.chapter6;

public class ShapeCircle extends Shape {
	// 圆形周长
	// 封装半径
	private double radius;

	// 半径赋值
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// 计算周长
	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

	// 形状
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return getColor() + " Circle";
	}
	
	// 带参调用
	public ShapeCircle(String color, double radius) {
		super(color);
		this.setRadius(radius);
	}
}
