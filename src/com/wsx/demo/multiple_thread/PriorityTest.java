package com.wsx.demo.multiple_thread;

public class PriorityTest {
	// 线程优先级测试
	public static void main(String[] args) {
		P_Hero garen = new P_Hero();
		garen.name = "盖伦";
		// 为方便观察优先级，将hp x 10，damage 变为1
		garen.hp = 6160;
		garen.damage = 1;
		P_Hero teemo = new P_Hero();
		teemo.name = "提莫";
		teemo.hp = 3000;
		teemo.damage = 1;
		P_Hero leesin = new P_Hero();
		leesin.name = "李青";
		leesin.hp = 4550;
		leesin.damage = 1;
		P_Hero ashe = new P_Hero();
		ashe.name = "艾希";
		ashe.hp = 3200;
		ashe.damage = 1;

		Thread thread1 = new Thread() {
			public void run() {
				while(!teemo.isDead()) {
					garen.attackHero(teemo);
				}
			}
		};
		
		Thread thread2 = new Thread() {
			public void run() {
				while(!leesin.isDead()) {
					ashe.attackHero(leesin);
				}
			}
		};
		
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		thread2.start();
	}
}
