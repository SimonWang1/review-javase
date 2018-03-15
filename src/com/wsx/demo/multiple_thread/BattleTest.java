package com.wsx.demo.multiple_thread;

public class BattleTest {
	// 多线程测试2
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "盖伦";
		garen.hp = 616;
		garen.damage = 50;
		Hero teemo = new Hero();
		teemo.name = "提莫";
		teemo.hp = 300;
		teemo.damage = 30;
		Hero leesin = new Hero();
		leesin.name = "李青";
		leesin.hp = 455;
		leesin.damage = 40;
		Hero ashe = new Hero();
		ashe.name = "艾希";
		ashe.hp = 320;
		ashe.damage = 70;

		Battle battle1 = new Battle(garen, teemo);
		// 使用Runnable实现多线程时需创建线程对象调用start()
		new Thread(battle1).start();
		Battle battle2 = new Battle(ashe, leesin);
		new Thread(battle2).start();
	}
}
