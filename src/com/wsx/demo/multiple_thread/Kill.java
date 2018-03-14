package com.wsx.demo.multiple_thread;

public class Kill extends Thread{
	// 继承Thread类实现多线程
	private Hero hero1;
	private Hero hero2;
	
	public Kill(Hero hero1, Hero hero2) {
		this.hero1 = hero1;
		this.hero2 = hero2;
	}
	
	public void run() {
		while(! hero2.isDead()) {
			hero1.attackHero(hero2);
		}
	}
}
