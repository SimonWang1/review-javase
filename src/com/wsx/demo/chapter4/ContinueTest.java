package com.wsx.demo.chapter4;

public class ContinueTest {
	// continue结束循环体中满足判断条件后的内容
	public static void main(String[] args){
		for(int i = 0; i < 5; i++){
			System.out.println("i的值："+ i);
			if(i == 3){
				continue;
			}
			System.out.println("continue后的输出语句");
		}
	}
}
