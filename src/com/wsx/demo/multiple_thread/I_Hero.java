package com.wsx.demo.multiple_thread;

public class I_Hero {
	// 线程交互实体类
	public String name;
	public float hp;
	public int damage;
	
	public synchronized void recover() {
		while(hp >= 1000) {
			try {
				// 释放同步对象this占有的线程并等待
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		hp = hp + 1;
		System.out.printf("%s 回血1点，增加血后，%s 的血量是 %.0f%n", name, name, hp);
		// 解除同步对象this的等待命令
		this.notify();
	}
	
	public synchronized void hurt() {
		while(hp <= 1) {
			try {
				// 释放同步对象this占有的线程并等待
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		hp = hp - 1;
		System.out.printf("%s 减血1点，减少血后，%s 的血量是 %.0f%n", name, name, hp);
		// 解除同步对象this的等待命令
		this.notify();
	}
	
	public void attrackHero(I_Hero hero) {
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
