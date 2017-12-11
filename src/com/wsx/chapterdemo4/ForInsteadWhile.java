package com.wsx.chapterdemo4;

public class ForInsteadWhile {
	public static void main(String[] args) {
		int count = 0;
		for (; count < 10;) {
			System.out.println(count);
			count++;
		}
		System.out.println("循环结束");
		int tmp = 0;
		for (int i = 0;i < 10;i++){
			tmp = i;
		}
		System.out.println("循环2结束" + tmp);
		
	}
}
