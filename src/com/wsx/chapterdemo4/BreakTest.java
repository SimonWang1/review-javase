package com.wsx.chapterdemo4;

public class BreakTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("i的值为：" + i);
			if (i == 5) {
				// 执行该语句结束循环
				break;
			}
		}
	}
}
