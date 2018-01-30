package com.wsx.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest2 {
	public static void main(String[] args) {
		List<Hero> heros = new ArrayList<>();
		// 在ArrayList中添加5个元素
		for(int i = 0; i < 5; i++) {
			heros.add(new Hero("Hero name " + i));
		}
		// for循环遍历
		System.out.println("--------for循环--------");
		for(int i = 0; i < heros.size(); i++) {
			System.out.println(heros.get(i));
		}
		// for each循环遍历
		System.out.println("--------foreach-------");
		for(Hero hero : heros) {
			System.out.println(hero);
		}
		// 迭代器循环遍历
		System.out.println("--------迭代器--------");
		Iterator<Hero> it = heros.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
