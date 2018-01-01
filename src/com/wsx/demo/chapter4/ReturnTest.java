package com.wsx.demo.chapter4;

public class ReturnTest {
	public static void main(String[] args){
		for(int i = 0; i < 5;i++){
			System.out.println("i的值：" + i);
			if(i == 3){
				return;
			}
			System.out.println("return后的输出语句");
		}
	}
}
