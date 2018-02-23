package com.wsx.demo.chapter4;

public class BreakTest2 {
	// break结束外循环
	public static void main(String[] args) {
		// 声明外循环为outer
		outer: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i的值：" + i + " j的值：" + j);
				// 判断条件
				if (i == 2) {
					break outer;
				}
			}
		}
	}
}
