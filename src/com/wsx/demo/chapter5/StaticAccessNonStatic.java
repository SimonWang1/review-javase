package com.wsx.demo.chapter5;

public class StaticAccessNonStatic {
	public void info() {
		System.out.println("�򵥵�info����");
	}
	public static void main(String[] args) {
		//ͨ���๹�������÷���
		new StaticAccessNonStatic().info();
	}
}