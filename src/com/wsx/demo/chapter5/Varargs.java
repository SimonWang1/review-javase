package com.wsx.demo.chapter5;

public class Varargs {
	public static void main(String[] args) {
		//调用test方法
		test(4, "算法图解", "需要一定Python基础才能有所收获的入门级算法书");
	}
	//定义形参个数可变的方法
	public static void test(int a, String...  books) {
		//books当做数组处理
		for(String book : books) {
			System.out.println(book);
		}
		//输出变量a
		System.out.println(a);
	}
}
