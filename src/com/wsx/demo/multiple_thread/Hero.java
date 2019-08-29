package com.wsx.demo.multiple_thread;

public class Hero {
	// 线程实体类
	private String name;
	private float hp;
	private int damage;

	public void attackHero(Hero otherHero) {
		try {
			// 表示进攻需要时间，每次攻击暂停1000ms
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		otherHero.hp -= damage;
		System.out.printf("%s 正在攻击 %s，%s 的血量变成了 %.0f%n", this.name, otherHero.name, 
				otherHero.name, otherHero.hp <= 0 ? 0 : otherHero.hp);
		if (otherHero.isDead()) {
			System.out.println(otherHero.name + "被击杀！");
		}
	}

	public boolean isDead() {
		return hp <= 0 ? true : false;
	}

	public Hero(String name, float hp, int damage) {
		super();
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}
	
	public Hero(String name) {
		super();
		this.name = name;
	}

	public Hero() {
		super();
	}
}
