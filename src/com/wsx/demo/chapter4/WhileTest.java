package com.wsx.demo.chapter4;

public class WhileTest {
	// while循环
	public static void main(String[] args) {
		int num = 0;
		while (num <= 5) {
			System.out.println(num);
			num++;
		}
		System.out.println("循环结束");
		int count = 0;
		while (count < 5) {
			System.out.println("死循环：" + count);
			count--;
		}
	}
}
