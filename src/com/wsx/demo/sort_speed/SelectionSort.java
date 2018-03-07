package com.wsx.demo.sort_speed;

public class SelectionSort implements Sort{
	// 选择排序
	int[] numbers;
	
	// 排序算法
	@Override
	public void sort() {
		for(int i = 0; i < numbers.length; i++) {
			int index = i;
			int element = numbers[i];
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[j] < element) {
					index = j;
					element = numbers[j];
				}
			}
			int temp = numbers[i];
			numbers[i] = numbers[index];
			numbers[index] = temp;
		}
	}

	// 获取排序后数组
	@Override
	public int[] values() {
		return numbers;
	}
	
	// 带参构造器传入待排序数组
	public SelectionSort(int[] numbers){
		this.numbers = numbers;
	}
}
