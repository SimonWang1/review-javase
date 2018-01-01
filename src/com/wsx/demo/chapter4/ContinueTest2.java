package com.wsx.demo.chapter4;

public class ContinueTest2 {
	public static void main(String[] args) {
		outer: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i的值：" + i + "j的值" + j);
				if (i == 3) {
					// 忽略outer标签所制定的循环中本次循环所剩下的语句
					continue outer;
				}
			}
		}
	}
}
