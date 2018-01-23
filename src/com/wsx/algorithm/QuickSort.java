package com.wsx.algorithm;

public class QuickSort {
	public static void main(String[] args) {
		int[] array = {10, 4, 3, 2, 5};
		quickSort(array);
	}
	
	public static void quickSort(int[] a) {
		sort(a, 0, a.length - 1);
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
	
	public static void sort(int[] a, int low, int high) {
		int start = low;
		int end = high;
		int pivot = a[low];
		while(end > start) {
			while(end > start && a[end] >= pivot)
				end--;
			if(a[end] <= pivot) {
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			while(end > start && a[start] <= pivot)
				start++;
			if(a[start] >= pivot) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
		}
		if(start > low) 
			sort(a, low, start - 1);
		if(end < high) 
			sort(a, end + 1, high);
	}
}
