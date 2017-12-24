package com.wsx.chapterdemo5_1;

class Base{
	public String name;
	public double size;
	public Base(String name, double size) {
		this.name = name;
		this.size = size;
	}
}

public class Sub extends Base{
	public static void main(String[] args) {
		Sub sub = new Sub("Ð¡ºì", 14, "ºìÉ«");
		System.out.println(sub.name + "------" + sub.size + "------" + sub.color);
	}
	
	public String color;
	public Sub(String name, double size, String color) {
		super(name, size);
		this.color = color;
	}
}
