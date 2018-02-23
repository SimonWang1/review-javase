package com.wsx.demo.chapter4;

public class ForErrorTest {
	// 死循环
	public static void main(String[] args){
		for(int count = 0; count < 10; count++){
			System.out.println(count);
			// 整形运算结果为0
			count *= 0.1;
		}
		System.out.println("循环结束");
	}
}
