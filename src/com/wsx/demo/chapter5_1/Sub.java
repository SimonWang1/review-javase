package com.wsx.demo.chapter5_1;

class Base{
	// super调用父类构造器
	public String name;
	public double size;
	//父类两参构造器
	public Base(String name, double size) {
		this.name = name;
		this.size = size;
	}
}

public class Sub extends Base{
	public static void main(String[] args) {
		//创建对象并打印
		Sub sub = new Sub("mary", 14, "red");
		System.out.println(sub.name + "------" + sub.size + "------" + sub.color);
	}
	
	public String color;
	//使用super显示调用父类构造器并添加新属性成为三参构造器
	public Sub(String name, double size, String color) {
		super(name, size);
		this.color = color;
	}
}
