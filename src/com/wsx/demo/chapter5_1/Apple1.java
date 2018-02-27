package com.wsx.demo.chapter5_1;

public class Apple1 {
	// this调用
	public String name;
	public String color;
	public double weight;

	// 两个参数的构造器
	public Apple1(String name, String color) {
		this.name = name;
		this.color = color;
	}

	// 三个参数的构造器
	public Apple1(String name, String color, double weight) {
		// 通过this调用重载构造器初始化代码
		this(name, color);
		// 下列this表示当前属性
		this.weight = weight;
	}

	public Apple1() {
	}
}
