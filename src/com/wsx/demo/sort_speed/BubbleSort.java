package com.wsx.demo.sort_speed;

public class BubbleSort implements Sort{
	// 冒泡排序
	int numbers[];
	
	// 排序算法
	@Override
	public void sort() {
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}

	// 获取排序后数组
	@Override
	public int[] values() {
		return numbers;
	}
	
	// 带参构造器传入待排序数组
	public BubbleSort(int[] numbers) {
		this.numbers = numbers;
	}
}
