package com.wsx.demo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnonymousClassTest {
	// 使用匿名类遍历集合进行比较
	public static void main(String[] args) {
		Random r = new Random();
		List<Hero> heros = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			heros.add(new Hero("Hero " + i, r.nextInt(1000), r.nextInt(100)));
		}
		System.out.println("初始化后的集合：");
		System.out.println(heros);
		System.out.println("使用匿名类的方式，筛选出hp > 100, damage < 50的英雄：");
		HeroChecker checker = new HeroChecker() {
			@Override
			public boolean test(Hero h) {
				return (h.hp > 100 && h.damage < 50);
			}
		};
		filter(heros, checker);
	}
	
	private static void filter(List<Hero> heros, HeroChecker checker) {
		for(Hero hero : heros) {
			if(checker.test(hero))
				System.out.print(hero);
		}
	}
}
