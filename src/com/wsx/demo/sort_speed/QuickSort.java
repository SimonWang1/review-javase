package com.wsx.demo.sort_speed;

public class QuickSort implements Sort{
	// 快速排序
	int[] numbers;
	
	// 算法逻辑
	private static void quickSort(int[] numbers, int low, int high) {
		int start = low;
		int end = high;
		int pivot = numbers[low];
		while(end > start) {
			while(end > start && numbers[end] >= pivot)
				end--;
			if(numbers[end] <= pivot) {
				int temp = numbers[end];
				numbers[end] = numbers[start];
				numbers[start] = temp;
			}
			while(end > start && numbers[start] <= pivot)
				start++;
			if(numbers[start] >= pivot) {
				int temp = numbers[start];
				numbers[start] = numbers[end];
				numbers[end] = temp;
			}
		}
		if(start > low) {
			quickSort(numbers, low, start - 1);
		}
		if(end < high) {
			quickSort(numbers, end + 1, high);
		}
	}
	
	// 排序算法
	@Override
	public void sort() {
		// 调用内部逻辑
		quickSort(numbers, 0, numbers.length - 1);
	}

	// 获取排序后数组
	@Override
	public int[] values() {
		return numbers;
	}
	
	// 带参构造器传入待排序数组
	public QuickSort(int[] numbers) {
		this.numbers = numbers;
	}
}
