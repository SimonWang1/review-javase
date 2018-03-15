package com.wsx.demo.multiple_thread;

public class Battle implements Runnable{
	// 实现Runnable接口实现多线程
	private Hero hero1;
	private Hero hero2;
	
	public Battle(Hero hero1, Hero hero2) {
		this.hero1 = hero1;
		this.hero2 = hero2;
	}
	
	// 重写run()
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!hero2.isDead()) {
			hero1.attackHero(hero2);
		}
	}
}
