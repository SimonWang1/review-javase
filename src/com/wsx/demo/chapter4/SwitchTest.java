package com.wsx.demo.chapter4;

public class SwitchTest {
	// Switch判断
	public static void main(String[] args) {
		char score = 'b';
		switch (score) {
		case 'a':
			System.out.println("优");
			break;
		case 'b':
			System.out.println("良");
			break;
		case 'c':
			System.out.println("及格");
			break;
		case 'd':
			System.out.println("不及格");
			break;
		default:
			System.out.println("输出有误");
		}
	}
}
