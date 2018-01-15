package com.wsx.algorithm;

public class BubbleSort {
	//冒泡排序
	public static void main(String[] args) {
		int[] intArray = { 54, 6, 78, 34, 12, 45 };
		//按照索引依次选取数组元素
		for (int i = 0; i < intArray.length; i++) {
			//按照索引依次与选中元素之后的元素进行比较
			for (int j = i + 1; j < intArray.length; j++) {
				//如果选中元素大于后者元素
				if (intArray[i] > intArray[j]) { 
					//按照索引顺序交换数组最大值
					int temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		//循环遍历冒泡后的数组
		for (int i : intArray) {
			System.out.print(i + " ");
		}
	}
}
