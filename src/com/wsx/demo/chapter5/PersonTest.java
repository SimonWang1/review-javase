package com.wsx.demo.chapter5;

public class PersonTest {
	// POJO����
	public static void main(String[] args) {
		Person wsx = new Person();
		wsx.name = "Wangsx";
		System.out.print(wsx.name + " : ");
		wsx.say("Talk is cheap, show me your code.");
	}
}
