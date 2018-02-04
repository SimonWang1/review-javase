package com.wsx.demo.sort_speed;

public class BubbleSort implements Sort{
	// Ã°ÅİÅÅĞò
	int numbers[];
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

	@Override
	public int[] values() {
		return numbers;
	}
	
	public BubbleSort(int[] numbers) {
		this.numbers = numbers;
	}
}
