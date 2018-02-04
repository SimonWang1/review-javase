package com.wsx.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ComparatorTest {
	public static void main(String[] args) {
		// 比较器
		Random r = new Random();
		List<HeroC> heros = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			// 通过随机值实例化hero的hp和damage
			heros.add(new HeroC("Hero " + i, r.nextInt(100), r.nextInt(100)));
		}
		System.out.println("初始化后的集合");
		System.out.println(heros);
		// 引入comparator进行比较
		Comparator<HeroC> c = new Comparator<HeroC>() {
			@Override
			public int compare(HeroC o1, HeroC o2) {
				if(o1.hp >= o2.hp) 
					return 1;
				else
					return -1;
			}
		};
		Collections.sort(heros, c);
		System.out.println("排序后的集合");
		System.out.println(heros);
	}
}
