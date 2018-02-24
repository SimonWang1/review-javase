package com.wsx.demo.chapter4;

public class ForErrorTest {
	// 死循环
	public static void main(String[] args){
		for(int count = 0; count < 10; count++){
			System.out.println(count);
			// 变量声明为int类型只保留整数，结果为零
			count *= 0.1;
		}
		System.out.println("循环结束");
	}
}
