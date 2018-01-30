package com.wsx.algorithm;

public class SelectionSort {
	// 选择排序
	public static void main(String[] args) {
		int[] intArray = { 54, 6, 78, 34, 12, 45 };
		System.out.println("排序前的数组: ");
		for (int i : intArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 遍历数组
		for (int i = 0; i < intArray.length; i++) {
			// 声明临时变量存储选中索引和元素值
			int index = i;
			int element = intArray[i];
			// 比较选中元素之后的元素值
			for (int j = i + 1; j < intArray.length; j++) {
				// 如果选中元素小于后者
				if (intArray[j] < element) {
					// 将对应元素的索引和值存储在临时变量中
					index = j;
					element = intArray[j];
				}
			}
			// 交换元素，比较下一个
			int temp = intArray[i];
			intArray[i] = intArray[index];
			intArray[index] = temp;
		}
		System.out.println("排序后的数组: ");
		for (int i : intArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
