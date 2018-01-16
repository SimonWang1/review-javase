package com.wsx.algorithm;

public class BinarySearch {
	public static void main(String[] args) {
		int[] intArray = {1, 3, 5, 7, 9};
		binarySearch(intArray, 7);
		binarySearch(intArray, 10);
	}

	//二分法查找
	public static void binarySearch(int[] intArray, int item) {
		//数组最小值下标
		int low = 0;
		//数组最大值下标
		int high = intArray.length -1;
		//在数组范围内循环遍历
		while(low <= high) {
			//数组中间值下标
			int mid = (low + high) / 2;
			//数组中间值
			int guess = intArray[mid];
			//若找到数值， 打印数值所在位置并中断循环
			if(guess == item) {
				System.out.println(mid + 1);
				break;
			}
			//若中间值比数值大，最大值下标变为中间值下标减一，即在小值范围内查找
			else if(guess > item) {
				high = mid - 1;
			}
			//若中间值比数值小，最小值下标变为中间值下标加一，即在大值范围内查找
			else {
				low = mid + 1;
			}
		}
		//若超出数组范围，说明此数不在数组中
		if(low > high) {
			System.out.println("None");
		}
	}
}
