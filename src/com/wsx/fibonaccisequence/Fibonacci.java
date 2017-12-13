package com.wsx.fibonaccisequence;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a value of n: ");
		int n = scan.nextInt();
		int num1 = 0;
		int num2 = 1;
		for (int i = 0; i <= n; i++) {
			num1 += num2;
			num2 = num1 - num2;
		}
		System.out.println("F(" + n + ") = " + num2);
	}
}
