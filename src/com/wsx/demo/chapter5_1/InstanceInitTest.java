package com.wsx.demo.chapter5_1;

public class InstanceInitTest {
	// 实例化初始顺序
	// 执行初始化块将变量a赋值为6
	{
		a = 6;
	}
	
	// 修改变量a的值
	int a = 9;

	public static void main(String[] args) {
		System.out.println(new InstanceInitTest().a);
	}
}
