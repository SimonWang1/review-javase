package com.wsx.demo.sort_speed;

import java.util.Arrays;

public class SortSpeedCompare {
	public static void main(String[] args) {
		// 初始化随机数
		int total = 40000;
		System.out.println("初始化一个长度为" + total + "的数组");
		int[] originalNums = new int[total];
		for(int i = 0; i < originalNums.length; i++) {
			originalNums[i] = (int)(Math.random() * total);
		}
		System.out.format("初始化完毕%n开始算法进行排序...%n");
		// 从初始化的数组中复制出来，保证排序算法操作的数组都是相同的
		int[] useSort;
		useSort = Arrays.copyOf(originalNums, originalNums.length);
		int[] sortedNumbersByBubbleSort = performance(new BubbleSort(useSort), "冒泡");
		useSort = Arrays.copyOf(originalNums, originalNums.length);
		int[] sortedNumbersBySelectionSort = performance(new SelectionSort(useSort), "选择");
		useSort = Arrays.copyOf(originalNums, originalNums.length);
		int[] sortedNumbersByQuickSort = performance(new QuickSort(useSort), "快速");
		System.out.println("查看排序结果，是否为不同对象：");
		System.out.println(sortedNumbersByBubbleSort);
		System.out.println(sortedNumbersBySelectionSort);
		System.out.println(sortedNumbersByQuickSort);
		System.out.println("查看排序结果内容是否相同");
		System.out.println("比较 冒泡排序 和 选择排序 的结果：");
		System.out.println(Arrays.equals(sortedNumbersByBubbleSort, sortedNumbersBySelectionSort));
		System.out.println("比较 选择排序 和 快速排序 的结果：");
		System.out.println(Arrays.equals(sortedNumbersBySelectionSort, sortedNumbersByQuickSort));
	}
	
	private static int[] performance(Sort algorithm, String type) {
		long start = System.currentTimeMillis();
		algorithm.sort();
		int sortNumbers[] = algorithm.values();
		long end = System.currentTimeMillis();
		System.out.format("%s排序，一共耗时 %d 毫秒%n", type, end - start);
		return sortNumbers;
	}
}
