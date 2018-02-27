package com.wsx.demo.chapter5_1;

class Parent {
	// 父类
	public String tag = "Talk is cheap";
}

class Derived extends Parent {
	// private String tag = "Show me your code";
}

public class HideTest {
	// 封装属性，外部访问需要添加set、get方法
	public static void main(String[] args) {
		Derived d = new Derived();
		// 不能访问子类封装变量
		// System.out.println(d.tag);
		// 向上转型输出父类属性变量
		System.out.println(((Parent) d).tag);
	}
}
