package com.wsx.fibonaccisequence;

import java.util.Scanner;

public class FibonacciSequence {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a value of n£º");
		int i = scan.nextInt();
		System.out.println("F(" + i + ") = " + Fibonacci(i));
	}

	public static Integer Fibonacci(Integer n) {
		if (n <= 2) {
			return 1;
		} else {
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
	}
}
