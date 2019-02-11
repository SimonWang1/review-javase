package com.wsx.algorithm;

// 乘法表递归实现
public class JJMul {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= i; j ++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
		JJMulDG(9);
	}
	
	public static void JJMulDG(int i) {
		// 基线条件
		if(i == 1) {
			System.out.println("1*1=1");
		}
		// 递归条件
		else {
			JJMulDG(i - 1);
			for(int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
