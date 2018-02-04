package com.wsx.demo.sort_speed;

public class SelectionSort implements Sort{
	// —°‘Ò≈≈–Ú
	int[] numbers;
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

	@Override
	public int[] values() {
		return numbers;
	}
	
	public SelectionSort(int[] numbers){
		this.numbers = numbers;
	}
}
