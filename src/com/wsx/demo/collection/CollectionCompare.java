package com.wsx.demo.collection;

import java.util.*;

public class CollectionCompare {
	// List和Set添加特性
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(3);
		numList.add(9);
		numList.add(6);
		System.out.println("List添加有顺序：");
		System.out.println(numList);
		numList.add(9);
		System.out.println("List可以添加重复值：");
		System.out.println(numList);
		Set<Integer> numSet = new HashSet<>();
		numSet.add(3);
		numSet.add(9);
		numSet.add(6);
		System.out.println("Set添加无顺序：");
		System.out.println(numSet);
		numSet.add(6);
		System.out.println("Set不能添加重复值：");
		System.out.println(numSet);
	}
}
