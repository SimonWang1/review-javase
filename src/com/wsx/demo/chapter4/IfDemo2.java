package com.wsx.demo.chapter4;

import java.util.Scanner;

public class IfDemo2 {
	// ²ÂÊýDemo
	private final static int NUM = 23;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter an integer: ");
			int guess = scanner.nextInt();
			if (guess == NUM) {
				System.out.println("Congratulations, you guess it. ");
				System.out.println("but you do not win any prizes! ");
				break;
			} else if (guess < NUM) {
				System.out.println("No, it is little higher than that. ");
			} else if (guess > NUM) {
				System.out.println("No, it is little lower than that. ");
			}
			System.out.println("Done");
		}
	}
}
