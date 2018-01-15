package com.wsx.algorithm;

public class SelectionSort1 {
	public static void main(String[] args) {
		int[] intArray = { 12, 11, 45, 6, 8, 43, 40, 57, 3, 20 };
		System.out.println("排序前的数组");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < intArray.length; i++) {
			int index = i;
			int element = intArray[i];
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[j] < element) {
					index = j;
					element = intArray[j];
				}
			}
			int temp = intArray[i];
			intArray[i] = intArray[index];
			intArray[index] = temp;
		}
		System.out.println("排序后的数组");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
	}
}
