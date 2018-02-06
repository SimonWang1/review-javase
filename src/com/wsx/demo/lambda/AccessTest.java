package com.wsx.demo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AccessTest {
	// 调用测试
	public static void main(String[] args) {
		Random r = new Random();
		List<Hero> heros = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			heros.add(new Hero("Hero " + i, r.nextInt(1000), r.nextInt(100)));
		}
		System.out.println("初始化后的集合：");
		System.out.println(heros);
		HeroChecker checker = new HeroChecker() {
			@Override
			public boolean test(Hero h) {
				return (h.hp > 100 && h.damage < 50);
			}
		};
		System.out.println("使用匿名类过滤：");
		filter(heros, checker);
		System.out.println("使用Lambda表达式过滤：");
		filter(heros, h -> h.hp > 100 && h.damage < 50);
		System.out.println("在Lambda表达式中使用静态方法过滤：");
		filter(heros, h -> AccessTest.testHero1(h));
		System.out.println("直接引用静态方法：");
		filter(heros, AccessTest :: testHero1);
		System.out.println("使用对象方法：");
		AccessTest accessTest = new AccessTest();
		filter(heros, accessTest :: testHero2);
	}
	
	private static boolean testHero1(Hero h) {
		return h.hp > 100 && h.damage < 50;
	}
	
	private boolean testHero2(Hero h) {
		return h.hp > 100 && h.damage < 50;
	}
	
	private static void filter(List<Hero> heros, HeroChecker checker) {
		for(Hero hero : heros) {
			if(checker.test(hero))
				System.out.print(hero);
		}
	}
}
