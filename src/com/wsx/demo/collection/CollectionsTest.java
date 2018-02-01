package com.wsx.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
	public static void main(String[] args) {
		// Collections是集合的工具类，就像Arrays是数组的工具类
		List<Integer> nums = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			nums.add(i);
		}
		System.out.println("集合中的元素：");
		System.out.println(nums);
		// reverse(list): 反转
		Collections.reverse(nums);;
		System.out.println("反转后的元素：");
		System.out.println(nums);
		// shuffle(list): 混淆
		Collections.shuffle(nums);
		System.out.println("混淆后的元素：");
		System.out.println(nums);
		// sort(list): 排序
		Collections.sort(nums);
		System.out.println("排序后的元素：");
		System.out.println(nums);
		// swap(list, index, index): 交换
		Collections.swap(nums, 0, 5);
		System.out.println("交换后的元素：");
		System.out.println(nums);
		// rotate(list, distance): 滚动
		Collections.rotate(nums, 2);
		System.out.println("滚动后的元素：");
		System.out.println(nums);
		// synchronizedList(list): 线程安全化
		System.out.println("将非线程安全的List转化成线程安全的List：");
		List<Integer> synchronizedNums = Collections.synchronizedList(nums);
		System.out.println(synchronizedNums);
	}
}
