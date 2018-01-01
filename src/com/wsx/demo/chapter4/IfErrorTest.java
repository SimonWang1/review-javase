package com.wsx.demo.chapter4;

public class IfErrorTest {
	public static void main(String[] args) {
		int age = 55;
		if (age >= 45 | age < 60) {
			System.out.println("中年");
		} else if (age >= 30 | age < 45) {
			System.out.println("壮年");
		} else if (age > 20 | age < 30) {
			System.out.println("青年");
		}
	}
}
