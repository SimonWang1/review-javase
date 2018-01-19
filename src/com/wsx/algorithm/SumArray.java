package com.wsx.algorithm;

public class SumArray {
	public static void main(String[] args) {
		// 数组求和
		int[] intArray= {1, 2, 3, 4, 5};
		System.out.println(sumArray1(intArray));
		System.out.println(sumArray2(intArray, intArray.length));
	}
	
	// 普通实现
	public static int sumArray1(int[] intArray) {
		int total = 0;
		for(int j : intArray) {
			total += j;
		}
		return total;
	}
	
	// 递归实现
	public static int sumArray2(int[] intArray, int len) {
		// 基线条件
		if(len == 1) {
			return intArray[0];
		}
		// 递归条件
		else {
			return intArray[len - 1] + sumArray2(intArray, --len);
		}
	}
}
