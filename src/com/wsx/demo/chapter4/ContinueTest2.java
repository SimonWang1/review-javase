package com.wsx.demo.chapter4;

public class ContinueTest2 {
	// continue结束外循环
	public static void main(String[] args) {
		outer: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i的值：" + i + " j的值" + j);
				if (i == 3) {
					// 只结束outer标签循环体中满足判断条件后的内容
					continue outer;
				}
			}
		}
	}
}
