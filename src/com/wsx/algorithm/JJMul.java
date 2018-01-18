package com.wsx.algorithm;

public class JJMul {
	public static void main(String[] args) {
		// 普通乘法表
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= i; j ++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
		JJMulDG(9);
	}
	
	// 递归乘法表
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
