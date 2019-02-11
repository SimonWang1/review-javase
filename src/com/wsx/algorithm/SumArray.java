package com.wsx.algorithm;

// 数组元素求和
public class SumArray {
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};
		System.out.println(sumArray1(intArray));
		System.out.println(sumArray2(intArray, intArray.length));
	}
	
	// 普通实现
	public static int sumArray1(int[] intArray) {
		int total = 0;
		for (int j : intArray) {
			total += j;
		}
		return total;
	}
	
	/**
		栈内存递归调用过程
		5 + sumArray2(intArray, 4)
		4 + sumArray2(intArray, 3)
		3 + sumArray2(intArray, 2)
		2 + sumArray2(intArray, 1)
		1 + sumArray2(intArray, 0)	-- 到达基线条件，栈顶值为0，方法返回，依次调用挂起方法
		1 + 0 = 1
		2 + 1 = 3
		3 + 3 = 6
		4 + 6 = 10
		5 + 10 = 15
	 */
	// 递归实现
	public static int sumArray2(int[] intArray, int len) {
		// 基线条件
		if (len == 0) {
			return 0;
		}
		// 递归条件
		else {
			return intArray[len - 1] + sumArray2(intArray, len - 1);
		}
	}
}
