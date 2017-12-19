package com.wsx.chapterdemo5;

public class VariableOverrideTest {
	//实例变量
	private String name = "Wangsx";
	//静态变量
	private static double price = 54.8;
	public static void main(String[] args) {
		//方法局部变量覆盖成员变量
		int price = 68;
		System.out.println(price);
		System.out.println(VariableOverrideTest.price);
		new VariableOverrideTest().info();
	}
	
	public void info() {
		//方法局部变量覆盖成员变量
		String name = "Simon";
		System.out.println(name);
		//使用this引用name的实例变量的值
		System.out.println(this.name);
	}
}
