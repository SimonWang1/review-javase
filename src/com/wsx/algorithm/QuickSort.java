package com.wsx.algorithm;

public class QuickSort {
	// 快速排序
	public static void main(String[] args) {
		int[] array = { 54, 6, 78, 34, 12, 45 };
		quickSort(array);
	}
	
	public static void quickSort(int[] a) {
		sort(a, 0, a.length - 1);
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
	
	public static void sort(int[] a, int low, int high) {
		// 起始元素索引
		int start = low;
		// 结束元素索引
		int end = high;
		// 基准值
		int pivot = a[low];
		// 遍历数组找到pivot位置
		while(end > start) {
			// 从数组末尾向前比较，end元素值大于pivot，end左移
			while(end > start && a[end] >= pivot)
				end--;
			// 当end元素值小于pivot
			if(a[end] <= pivot) {
				// 交换，此时start元素值等于pivot
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			// 从数组开头向后比较，start元素值小于pivot，start右移
			while(end > start && a[start] <= pivot)
				start++;
			// 当start元素值大于pivot
			if(a[start] >= pivot) {
				// 交换，此时end元素值等于pivot
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
			// 循环结束时start, end等于pivot index，pivot左侧为小值，右侧为大值
		}
		// 左侧递归调用，基线条件为start到达数组左侧
		if(start > low) 
			// 递归条件，范围：[0, pivot index - 1]
			sort(a, low, start - 1);
		// 右侧递归调用，基线条件为end到达数组右侧
		if(end < high) 
			// 递归条件，范围：[pivot index + 1, array.length - 1]
			sort(a, end + 1, high);
	}
}
