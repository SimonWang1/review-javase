package com.wsx.demo.collection;

public class HeroB implements Comparable<HeroB>{
	// 实现比较接口，重写比较方法
	public String name;
	public float hp;
	public int damage;
	// 按照伤害从小到大排序
	public int compareTo(HeroB anotherHero) {
		if(damage >= anotherHero.damage) 
			return 1;
		else
			return -1;
	}
	
	public HeroB(String name, float hp, int damage) {
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}
	
	public HeroB(String name) {
		this.name = name;
	}
	
	public HeroB() {
		
	}

	@Override
	public String toString() {
		return "HeroB [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
	}
}
