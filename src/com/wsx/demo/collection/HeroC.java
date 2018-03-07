package com.wsx.demo.collection;

public class HeroC {
	// 实体类C
	public String name;
	public float hp;
	public int damage;
	
	// 三参构造器
	public HeroC(String name, float hp, int damage) {
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}
	
	public HeroC(String name) {
		this.name = name;
	}
	
	public HeroC() {
		
	}

	@Override
	public String toString() {
		return "HeroC [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
	}
}
