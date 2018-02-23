package com.wsx.demo.chapter4;

public class BreakTest {
	// break结束循环
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("i的值为：" + i);
			// 判断条件
			if (i == 5) {
				break;
			}
		}
	}
}
