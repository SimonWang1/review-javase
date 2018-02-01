package com.wsx.demo.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		// 本质是散列表的键，不允许重复，添加没有顺序，线程不安全
		Set<String> names = new HashSet<>();
		names.add("gareen");
		System.out.println(names);
		// Set中元素不能重复，只会保留一个
		names.add("gareen");
		System.out.println(names);
		// Set中元素的插入顺序是随机的
		Set<Integer> numbers = new HashSet<>();
		numbers.add(4);
		numbers.add(1);
		numbers.add(9);
		System.out.println(numbers);
		// 遍历数组使用增强for循环或迭代器
		Set<Integer> nums = new HashSet<>();
		for(int i = 0; i < 10; i++) {
			nums.add(i);
		}
		for(int i : nums) {
			System.out.println(i);
		}
		System.out.println("----------------------");
		Iterator<Integer> iterator = nums.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
