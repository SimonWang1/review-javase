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
			// 从数组末尾向前比较，元素值大于pivot，end左移
			while(end > start && a[end] >= pivot)
				end--;
			// 如果元素值小于pivot，交换元素值
			if(a[end] <= pivot) {
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			// 从数组开头向后比较，元素值小于pivot，start右移
			while(end > start && a[start] <= pivot)
				start++;
			// 如果元素值大于pivot，交换元素值
			if(a[start] >= pivot) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
			// 循环结束时start, end等于pivot index，pivot左侧为小值，右侧为大值
		}
		// 左侧递归调用
		if(start > low) 
			// 范围：[start, pivot index - 1]
			sort(a, low, start - 1);
		// 右侧递归调用
		if(end < high) 
			// 范围：[pivot index + 1, end]
			sort(a, end + 1, high);
	}
}
