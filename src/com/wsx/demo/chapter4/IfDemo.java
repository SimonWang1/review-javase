package com.wsx.demo.chapter4;

public class IfDemo {
	// 年龄段划分
	public static void main(String[] args) {
		int age = 24;
		if (age > 20 & age < 30) {
			System.out.println("青年");
		} else if (age >= 30 & age < 45) {
			System.out.println("壮年");
		} else if (age >= 45 & age < 60) {
			System.out.println("中年");
		}
	}
}
