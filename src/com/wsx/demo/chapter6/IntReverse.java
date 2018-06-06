package com.wsx.demo.chapter6;

public class IntReverse {
	public static void main(String[] args) {
		int num = 123456;
		int len = String.valueOf(num).length();
		System.out.println(len);
		int result = 0;
		while(true) {
			int n = num % 10;
			result = result * 10 + n;
			num = num / 10;
			if(num == 0)
				break;
		}
		System.out.println(result);
	}
}
