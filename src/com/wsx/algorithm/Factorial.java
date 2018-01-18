package com.wsx.algorithm;

import java.util.Scanner;

public class Factorial {
	// 递归调用栈
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("请输入一个正整数：");
			int i3 = scan.nextInt();
			System.out.println("普通阶乘值为：" + mul(i3));
			System.out.println("递归阶乘值为：" + mul(i3));
		}
	}
	
	// 普通阶乘
	public static int mul(int i) {
		int mul = 1;
		for(int j = 1; j <= i; j++) {
			mul *= j;
		}
		return mul;
	}
	
	// 递归阶乘
	public static int mul1(int i) {
		// 基线条件
		if(i == 1) {
			return 1;
		}
		// 递归条件
		else {
			// 栈顶在到达基线条件后的值为1，并从1开始对栈中挂起的参数依次阶乘
			return i * mul1(i - 1);
		}
	}
}
