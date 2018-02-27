package com.wsx.demo.chapter5;

public class Varargs {
	// 定义形参个数可变的方法
	public static void main(String[] args) {
		// 调用test方法
		test(3, "算法图解", "像小说一样有趣的算法入门书", "Turing");
	}

	public static void test(int a, String... books) {
		// books当做数组处理
		for (String book : books) {
			System.out.println(book);
		}
		// 输出变量a
		System.out.println(a);
	}
}
