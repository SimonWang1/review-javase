package com.wsx.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ComparableTest {
	public static void main(String[] args) {
		Random r = new Random();
		List<HeroB> heros = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			heros.add(new HeroB("Hero " + i, r.nextInt(100), r.nextInt(100)));
		}
		System.out.println("初始化后的集合：");
		System.out.println(heros);
		// HeroB类实现了Comparable比较信息，使用Collections排序即可识别
		Collections.sort(heros);
		System.out.println("按照伤害排序后的集合：");
		System.out.println(heros);
	}
}
