package com.wsx.chapterdemo4;

public class ForEachErrorTest {
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7};
		for(int A: a){
			System.out.println(A);
		}
//		no error
		System.out.println(a[0]);
	}
}
