package com.wsx.algorithm;

import java.util.Scanner;

// 쳲���������
public class Fibonacci {
	public static void main(String[] args) {
		while(true) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a value of n: ");
		int n = scan.nextInt();
		int num1 = 0;
		int num2 = 1;
			for (int i = 0; i < n; i++) {
				num1 += num2;
				num2 = num1 - num2;
			}
			System.out.println("F(" + n + ") = " + num1);
		}
	}
}
