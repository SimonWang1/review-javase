package com.wsx.demo.multiple_thread;

public class S_Hero {
	// 线程同步实体类
	public String name;
	public float hp;
	public int damage;
	
	// 两种线程同步方式实现效果相同
	// 回血
	public synchronized void recover() {
		hp = hp + 1;
	}
	
	// 掉血
	public void hurt() {
		synchronized (this) {
			hp = hp - 1;
		}
	}
	
	public void attrackHero(Hero hero) {
		hero.hp -= damage;
		System.out.printf("%s 正在攻击 %s，%s 的血量变成了 %.0f%n", name, hero.name, hero.name, hero.hp);
		if(hero.isDead()) {
			System.out.println(hero.name + "被击杀！");
		}
	}
	
	public boolean isDead() {
		return hp <= 0 ? true : false;
	}
}
