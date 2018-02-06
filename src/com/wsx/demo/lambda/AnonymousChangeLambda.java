package com.wsx.demo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnonymousChangeLambda {
	// 匿名类转换成Lambda表达式过程
	public static void main(String[] args) {
		Random r = new Random();
		List<Hero> heros = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			heros.add(new Hero("Hero " + i, r.nextInt(1000), r.nextInt(100)));
		}
		System.out.println("初始化后的集合：");
		System.out.println(heros);
		System.out.println("使用匿名类的方式，筛选出hp > 100, damage < 50的英雄：");
		// 匿名类正常写法
		System.out.println("Function1: ");
		HeroChecker c1 = new HeroChecker() {
			@Override
			public boolean test(Hero h) {
				return (h.hp > 100 && h.damage < 50);
			}
		};
		filter(heros, c1);
		// 省略创建对象过程和重写类权限修饰符、方法返回类型、方法名
		// 保留参数方法体，在参数类型后添加符号 "->"
		System.out.println("Function2: ");
		HeroChecker c2 = (Hero h) -> {
			return h.hp > 100 && h.damage < 50;
		};
		filter(heros, c2);
		// 去掉 "{}" 和 return 
		System.out.println("Function3: ");
		HeroChecker c3 = (Hero h) -> h.hp > 100 && h.damage < 50;
		filter(heros, c3);
		// 去掉参数引用声明和 "()" （只有在一个参数时可以去掉）
		System.out.println("Function4: ");
		HeroChecker c4 = h -> h.hp > 100 && h.damage < 50;
		filter(heros, c4);
		// 调用方法时直接使用Lambda表达式当做参数
		System.out.println("Function5: ");
		filter(heros, h -> h.hp > 100 && h.damage < 50);
	}
	
	private static void filter(List<Hero> heros, HeroChecker checker) {
		for(Hero hero : heros) {
			if(checker.test(hero))
				System.out.print(hero);
		}
	}
}
