package com.wsx.algorithm;

import java.util.Arrays;

// 快速排序
public class QuickSort {
	public static void main(String[] args) {
		int[] array = { 54, 6, 78, 34, 12, 45 };
		quickSort(array);
		Arrays.sort(array);
	}
	
	public static void quickSort(int[] a) {
		sort(a, 0, a.length - 1);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
	
	public static void sort(int[] a, int low, int high) {
		// 自增索引
		int start = low;
		// 自减索引
		int end = high;
		// 选取第一个数组元素为pivot（基准值）
		int pivot = a[low];
		// 遍历数组找到pivot位置
		while (end > start) {
			// 从数组末尾向前比较，跳过大于pivot的end元素，end左移
			while (end > start && a[end] >= pivot)
				end--;
			// 当end元素值小于pivot
			if (a[end] <= pivot) {
				// 与pivot交换
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			// 从数组开头向后比较，跳过小于pivot的start元素值，start右移
			while (end > start && a[start] <= pivot)
				start++;
			// 当start元素值大于pivot
			if (a[start] >= pivot) {
				// 与pivot交换
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
		}
		// 循环结束时pivot左侧为小值，右侧为大值
		// 左侧递归调用，基线条件为左侧遍历完毕
		if (start > low) 
			// 递归条件，范围：[0, pivot index - 1]
			sort(a, low, start - 1);
		// 右侧递归调用，基线条件为右侧遍历完毕
		if (end < high) 
			// 递归条件，范围：[pivot index + 1, array.length - 1]
			sort(a, end + 1, high);
	}
}
