package com.wsx.algorithm;

public class CutDown {
	// 简单递归
	public static void main(String[] args) {
		cutDown(5);
	}

	public static int cutDown(int i) {
		// 基线条件
		if(i <= 1) {
			return 1;
		}
		// 递归条件
		else {
			System.out.println(cutDown(i - 1));
			return i;
		}
	}
}
