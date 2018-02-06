package com.wsx.demo.lambda;

public class Hero implements Comparable<Hero>{
	// HeroÊµÌåÀà
	public String name;
	public float hp;
	public int damage;
	
	@Override
	public int compareTo(Hero anotherHero) {
		if(damage < anotherHero.damage)
			return 1;
		else
			return 0;
	}
	
	public Hero(String name, float hp, int damage) {
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}
	
	public Hero(String name) {
		this.name = name;
	}
	
	public Hero() {
		
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
	}
}
