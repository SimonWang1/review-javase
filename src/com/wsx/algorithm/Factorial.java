package com.wsx.algorithm;

import java.util.Scanner;

// 递归调用栈
public class Factorial {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("请输入一个正整数：");
			int num = scan.nextInt();
			System.out.println("普通阶乘值为：" + mul(num));
			System.out.println("递归阶乘值为：" + mul(num));
			/*
				假设输入5，栈内存递归调用过程
				5 * mul1(4)
				4 * mul1(3)
				3 * mul1(2)
				2 * mul1(1)
				2 * 1 = 2	-->	到达基线条件，此时栈顶值为1
				3 * 2 = 6
				4 * 6 = 24
				5 * 24 = 120
			*/
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
