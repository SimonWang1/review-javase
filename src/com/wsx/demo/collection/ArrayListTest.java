package com.wsx.demo.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	// ArrayList: 基于可增长数组，查询快，添加删除慢，线程不安全。
	public static void main(String[] args) {
		// 使用数组容易造成内存浪费和长度限制
		Hero[] heros = new Hero[5];
		heros[0] = new Hero("teemo");
		// 索引超出数组长度会报错
		// heros[20] = new Hero("gareen");
		for (Hero hero : heros) {
			System.out.println(hero);
		}
		// 创建容器类ArrayList，用于存放对象
		List<String> hero = new ArrayList<>();
		hero.add("garen");
		System.out.println(hero.size());
		// ArrayList的元素个数即是容器长度
		hero.add("teemo");
		System.out.println(hero.size());
	}
}
