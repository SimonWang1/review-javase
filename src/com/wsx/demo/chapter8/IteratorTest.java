package com.wsx.demo.chapter8;

import java.util.*;

public class IteratorTest {
	public static void main(String[] args) {
		Collection<String> books = new HashSet<String>();
		books.add("算法导论");
		books.add("Java编程思想");
		// 获取books集合对应的迭代器
		Iterator<String> it = books.iterator();
		while(it.hasNext()) {
			// it.next()方法返回的数据类型是Object类型，因此需要强制类型转换
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("算法导论")) {
				// 从集合中删除上一次next()方法返回的元素
				it.remove();
			}
			// 对book变量赋值，不会改变集合元素自身
			book = "测试字符串";
		}
		System.out.println(books);
	}
}
