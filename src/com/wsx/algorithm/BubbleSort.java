package com.wsx.algorithm;

public class BubbleSort {
	// 冒泡排序
	public static void main(String[] args) {
		int[] intArray = { 54, 6, 78, 34, 12, 45 };
		// 依次选取数组元素
		for (int i = 0; i < intArray.length; i++) {
			// 比较选中元素之后的元素值
			for (int j = i + 1; j < intArray.length; j++) {
				// 如果选中元素大于后者
				if (intArray[i] > intArray[j]) {
					// 交换元素，比较下一个
					int temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		// 循环遍历冒泡后的数组
		for (int i : intArray) {
			System.out.print(i + " ");
		}
	}
}
