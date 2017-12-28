package com.wsx.chapterdemo5_1;

public class StaticInitTest {
	//先执行静态初始化块将a静态成员变量赋值为6
	static {
		a = 6;
	}
	//再将a静态成员变量赋值为9
	static int a = 9;
	public static void main(String[] args) {
		System.out.println(StaticInitTest.a);
	}
}
