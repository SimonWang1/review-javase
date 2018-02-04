package com.wsx.demo.sort_speed;

public class QuickSort implements Sort{
	// ¿ìËÙÅÅĞò
	int[] numbers;
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
	
	@Override
	public void sort() {
		quickSort(numbers, 0, numbers.length - 1);
	}

	@Override
	public int[] values() {
		return numbers;
	}
	
	public QuickSort(int[] numbers) {
		this.numbers = numbers;
	}
}
