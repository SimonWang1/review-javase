package com.wsx.algorithm;

// 递归算法
public class Recursive {
	public static void main(String[] args) {
		System.out.println(func(10));
		System.out.println(func2(10));
	}

	// 已知起始值求正向结果
	// f(0) = 1, f(1) = 4, f(n + 2) = 2 * f(n + 1) + f(n)，求f(10)
	public static int func(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 4;
		} else {
			return 2 * func(n - 1) + func(n - 2);
		}
	}

	// 已知末尾值求反向结果
	// f(20) = 1, f(21) = 4, f(n + 2) = 2 * f(n + 1） + f(n)，求f(10)
	// 转换成：f(n) = f(n + 2) - 2 * f(n + 1)
	public static int func2(int n) {
		if (n == 20) {
			return 1;
		} else if (n == 21) {
			return 4;
		} else {
			return func2(n + 2) - 2 * func2(n + 1);
		}
	}
}
