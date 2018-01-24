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
		// 基准值索引
		int pivot = a[low];
		// 遍历数组，找到基准值位置
		while(end > start) {
			// 从数组末尾向前比较，元素值大于基准值，结束元素索引左移
			while(end > start && a[end] >= pivot)
				end--;
			// 如果元素值比基准值小，交换元素值，顺序执行循环体
			if(a[end] <= pivot) {
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			// 从数组开头向后比较，元素值小于基准值，起始元素索引右移
			while(end > start && a[start] <= pivot)
				start++;
			// 如果元素值比基准值大，交换元素值，返回开头执行循环体
			if(a[start] >= pivot) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
			// 结束时基准值左侧小于基准值，右侧大于基准值
		}
		// 前半部分递归调用
		if(start > low) 
			// 数组起始元素索引到基准值前一个元素索引
			sort(a, low, start - 1);
		// 后半部分递归调用
		if(end < high) 
			// 基准值后一个元素索引到数组结束元素索引
			sort(a, end + 1, high);
	}
}
