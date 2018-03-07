package com.wsx.demo.collection;

import java.util.LinkedList;

public class LinkedListTest {
	// LinkedList: 基于双向链表Deque，查询慢，添加删除快，线程不安全
	public static void main(String[] args) {
		LinkedList<Hero> heros = new LinkedList<>();
		// 可以方便的在头部和尾部插入数据
		// 尾部插入数据
		heros.addLast(new Hero("hero1"));
		heros.addLast(new Hero("hero2"));
		heros.addLast(new Hero("hero3"));
		System.out.println(heros);
		// 头部插入数据
		heros.addFirst(new Hero("hero0"));
		// 双向链表前后存储下一个元素的地址
		System.out.println(heros);
		// 查看最前数据
		System.out.println(heros.getFirst());
		// 查看最后数据
		System.out.println(heros.getLast());
		// 移除最前数据
		heros.removeFirst();
		// 移除最后数据
		heros.removeLast();
		System.out.println(heros);
	}
}
