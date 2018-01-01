package com.wsx.demo.chapter4;

public class DoWhileTest {
	public static void main(String[] args) {
		int count = 0;
		do {
			count++;
			System.out.println("dowhile循环:" + count);
		} while (count < 5);
		System.out.println("循环结束");
		int count2 = 20;
		do {
			count2--;
			System.out.println("dowhile循环2：" + count2);
		} while (count2 > 30);
		System.out.println("循环2结束");
	}
}
