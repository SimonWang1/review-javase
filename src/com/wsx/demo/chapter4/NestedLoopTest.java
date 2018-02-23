package com.wsx.demo.chapter4;

public class NestedLoopTest {
	// 循环嵌套
	public static void main(String[] args) {
		// 外循环
		for (int i = 0; i < 5; i++) {
			// 内循环
			for (int j = 0; j < 3; j++) {
				System.out.printf("i的值为：" + i + "\t j的值为：" + j + "\n");
			}
		}
	}
}
