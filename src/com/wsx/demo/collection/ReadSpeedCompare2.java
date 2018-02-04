package com.wsx.demo.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadSpeedCompare2 {
	// ArrayList和LinkedList速度比较
	public static void main(String[] args) {
		List<Integer> list;
		list = new ArrayList<>();
		insertFirst(list, "ArrayList");
		modify(list, "ArrayList");
		System.out.println("-----------------------------------------------");
		list = new LinkedList<>();
		insertFirst(list, "LinkedList");
		modify(list, "LinkedList");
	}
	
	private static void insertFirst(List<Integer> l, String type) {
		int total = 1000 * 100;
		final int number = 5;
		long start = System.currentTimeMillis();
		for(int i = 0; i < total; i++) {
			l.add(0, number);
		}
		long end = System.currentTimeMillis();
		System.out.format("在%s 同一索引插入%d 条数据，耗时%d 毫秒%n", type, total, end - start);
	}
	
	private static void modify(List<Integer> l, String type) {
		int total = 1000* 100;
		int index = total / 2;
		final int number = 5;
		// 初始化数组
		for(int i = 0; i < total; i++) {
			l.add(number);
		}
		long start = System.currentTimeMillis();
		for(int i = 0; i < total; i++) {
			int n = l.get(index);
			n++;
			l.set(index, n);
		}
		long end = System.currentTimeMillis();
		System.out.format("%s 总长度是%d，定位到第%d 个数据，取出来+1再放回去%n"
				+ "重复%d 遍，总共耗时%d 毫秒%n", type, total, index, total, end - start);
	}
}
