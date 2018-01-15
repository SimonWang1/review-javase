package com.wsx.algorithm;

public class SelectionSort1 {
	//选择排序
	public static void main(String[] args) {
		int[] intArray = { 54, 6, 78, 34, 12, 45 };
		System.out.println("排序前的数组: ");
		for (int i : intArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		//按照索引依次选取数组元素
		for (int i = 0; i < intArray.length; i++) {
			//依次声明数组元素的索引和元素值
			int index = i;
			int element = intArray[i];
			//按照索引依次与选中之后的元素值进行比较
			for (int j = i + 1; j < intArray.length; j++) {
				//找到数组元素的最小值，将对应元素的索引和值存储在外循环变量中
				if (intArray[j] < element) {
					index = j;
					element = intArray[j];
				}
			}
			//按照索引顺序交换数组最小值
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
