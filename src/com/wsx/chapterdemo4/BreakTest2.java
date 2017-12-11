package com.wsx.chapterdemo4;

public class BreakTest2 {
	public static void main(String[] args) {
		outer: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i的值：" + i + " j的值：" + j);
				if (i == 2) {
					// 中断循环
					break outer;
				}
			}
		}
	}
}
