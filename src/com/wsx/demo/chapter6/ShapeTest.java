package com.wsx.demo.chapter6;

public class ShapeTest {
	public static void main(String[] args) {
		Shape triangle = new ShapeTriangle("Black", 3, 4, 5);
		Shape circle = new ShapeCircle("Yellow", 3);
		System.out.println("三角形：" + triangle.getType());
		System.out.println("周长取整：" + Math.round(triangle.calPerimeter()));
		System.out.println("圆形：" + circle.getType());
		System.out.println("周长取整：" + Math.round(circle.calPerimeter()));
	}
}
