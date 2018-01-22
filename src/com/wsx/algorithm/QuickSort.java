package com.wsx.algorithm;

public class QuickSort {
	public static void main(String[] args) {
		int[] array = {2};
		quickSort(array);
	}
	
	public static void quickSort(int[] array) {
//		int less, greater;
		if(array.length < 2) {
			for(int i : array) {
				System.out.print(i);
			}
		}
		else {
			int pivot = array[0];
			for(int i = 2; i < array.length; i++) {
				if(array[i] <= pivot) {
//					less = array[i];
				}
				else {
//					greater = array[i];
				}
			}
		}
	}
}
