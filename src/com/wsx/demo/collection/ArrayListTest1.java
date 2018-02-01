package com.wsx.demo.collection;

import java.util.ArrayList;

public class ArrayListTest1 {
	// ArrayList常用方法
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		// ArrayList: 基于数组，对比数组长度可变，查询快，添加删除慢，线程不安全
		ArrayList heros = new ArrayList();
		// add(element): 在ArrayList容器中添加5个元素
		for(int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + i));
		}
		System.out.println(heros.toString());
		// add(index, element): 在指定索引添加元素
		Hero specialHero = new Hero("special hero");
		heros.add(1, specialHero);
		System.out.println(heros.toString());
		// contains(element): 判断一个对象是否在容器中，标准为引用是否指向同一块堆内存，不是对比内容
		System.out.println(heros.contains(new Hero("special hero")));
		System.out.println(heros.contains(specialHero));
		// get(index): 获取指定索引的元素
		System.out.println(heros.get(2));
		// 索引越界报错
//		System.out.println(heros.get(7));
		// indexOf(element): 获取元素索引
		System.out.println("Special hero's index: " + heros.indexOf(specialHero));
		// remove(index): 删除索引为0和对象类型元素
		heros.remove(0);
		heros.remove(specialHero);
		System.out.println(heros.toString());
		// set(index, element): 修改指定索引的元素
		heros.set(3, "last hero");
		System.out.println(heros.toString());
		// size(): 获取容器长度
		System.out.println(heros.size());
		// clear(): 清空数组
		heros.clear();
		System.out.println(heros.toString());
	}
}
