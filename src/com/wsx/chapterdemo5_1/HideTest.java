package com.wsx.chapterdemo5_1;

class Parent{
	public String tag = "Talk is cheap";
}

class Derived extends Parent{
	private String tag = "Show me your code";
}

public class HideTest {
	public static void main(String[] args) {
		Derived d = new Derived();
		//不能访问私有
//		System.out.println(d.tag);
		//向上转型输出父类
		System.out.println(((Parent)d).tag);
	}
}
