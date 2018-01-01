package com.wsx.demo.chapter5;

public class Recursive {
	public static void main(String[] args) {
		System.out.println(func(10));
		System.out.println(func(10));
	}
	//f(0) = 1, f(1) = 4, f(n + 2) = 2 * f(n + 1) + f(n)£¬Çóf(10)
	public static int func(int n) {
		if(n == 0) {
			return 1;
		}
		else if(n == 1) {
			return 1;
		}
		else {
			return 2 * func(n - 1) + func(n - 2);
		}
	}
	//f(20) = 1, f(21) = 4, f(n + 2) = 2 * f(n + 1£© + f(n)£¬Çóf(10)
	public static int func2(int n) {
		if(n == 20) {
			return 1;
		}
		else if(n == 21) {
			return 4;
		}
		else {
			return func2(n + 2) - 2 * func2(n + 1);
		}
	}
}
