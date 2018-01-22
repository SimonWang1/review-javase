package com.wsx.demo.chapter8;

import java.util.*;

public class CollectionTest {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		// 添加元素
		c.add("孙悟空");
		// 添加泛型，不能add数字
//		c.add(4);
//		c.remove(4);
		System.out.println("c集合的元素的个数为: " + c.size());
		// 判断是否包含指定字符串
		System.out.println("c集合是否包含\"孙悟空\"字符串: "
				+ c.contains("孙悟空"));
		c.add("算法导论");
		System.out.println("c集合的元素: " + c);
		Collection<String> books = new HashSet<String>();
		books.add("算法导论");
		books.add("Java编程思想");
		System.out.println("c集合是否完全包含books集合: "
				+ c.containsAll(books));	// 输入false
		// 用c集合减去books集合里的元素
		c.removeAll(books);
		System.out.println("c集合的元素: " + c);
		// 删除c集合里的所有元素
		c.clear();
		System.out.println("c集合里的元素: " + c);
		// 控制books即合理只剩下c集合里也包含的元素
		books.retainAll(c);
		System.out.println("books集合的元素: " + books);
	}
}
