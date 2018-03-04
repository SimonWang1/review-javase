package com.wsx.demo.chapter6;

public class ShapeTriangle extends Shape {
	// 三角形周长
	// 封装边长
	private double a;
	private double b;
	private double c;

	// 边长赋值
	public void setSides(double a, double b, double c) {
		if (a >= b + c || b >= a + c || c >= a + b) {
			System.out.println("三角形两边之和必须大于第三边");
			return;
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// 计算周长
	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return a + b + c;
	}

	// 形状
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return getColor() + " Triangle";
	}
	
	// 带参调用
	public ShapeTriangle(String color, double a, double b, double c) {
		super(color);
		this.setSides(a, b, c);
	}
}

