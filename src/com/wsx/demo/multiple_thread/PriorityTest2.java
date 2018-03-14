package com.wsx.demo.multiple_thread;

public class PriorityTest2 {
	// 线程优先级测试2
	public static void main(String[] args) {
		P_Hero gareen = new P_Hero();
		gareen.name = "盖伦";
		gareen.hp = 6160;
		gareen.damage = 1;
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
					gareen.attackHero(teemo);
				}
			}
		};
		
		Thread thread2 = new Thread() {
			public void run() {
				while(!leesin.isDead()) {
					// 降低此线程优先级，让其他线程运行
					Thread.yield();
					ashe.attackHero(leesin);
				}
			}
		};
		
		thread1.setPriority(5);
		thread2.setPriority(5);
		thread1.start();
		thread2.start();
	}
}
