package com.wsx.algorithm;

public class Fact {
	// 递归调用栈，阶乘
	public static void main(String[] args) {
	// 栈顶在到达基线条件后的值为1，并从1开始对挂起的参数依次进行递归条件的运算操作
		System.out.println(fact(5));
	}
	
	public static int fact(int x) {
		// 基线条件
		if(x == 1) {
			return 1;
		}
		// 递归条件
		else {
			return x * fact(x - 1);
		}
	}
}
