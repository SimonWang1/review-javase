package com.wsx.chapterdemo5_1;

public class Apple1 {
	public String name;
	public String color;
	public double weight;
	public Apple1() {
	}
	//两个参数的构造器
	public Apple1(String name, String color) {
		this.name = name;
		this.color = color;
	}
	//三个参数的构造器
	public Apple1(String name, String color, double weight) {
		//通过this调用另一个重载的构造器初始化代码
		this(name, color);
		//下列this表示构造器初始化的Java对象
		this.weight = weight;
	}
}
