package com.wsx.demo.chapter4;

public class ForErrorTest {
	public static void main(String[] args){
		for(int count = 0; count < 10; count++){
			System.out.println(count);
			count *= 0.1;
		}
		System.out.println("Ñ­»·½áÊø");
	}
}
