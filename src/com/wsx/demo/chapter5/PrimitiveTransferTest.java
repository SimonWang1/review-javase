package com.wsx.demo.chapter5;

public class PrimitiveTransferTest {
	// 局部变量交换变量值方法
	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		swap(a, b);
		System.out.println("交换结束后，a的值是" + a + "；b的值是" + b);
	}

	public static void swap(int a, int b) {
		// 值传递
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("swap方法里，a的值是" + a + "；b的值是" + b);
	}
}
