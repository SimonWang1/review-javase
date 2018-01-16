package com.wsx.algorithm;

public class CutDown {
	// 简单递归
	public static void main(String[] args) {
		cutDown(3);
	}

	public static int cutDown(int i) {
		System.out.println(i);
		// 基线条件
		if (i <= 0) {
			return i;
		}
		// 递归条件
		else {
			cutDown(i - 1);
			return i;
		}
	}
}
