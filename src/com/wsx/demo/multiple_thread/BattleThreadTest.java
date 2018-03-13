package com.wsx.demo.multiple_thread;

public class BattleThreadTest {
	// 多线程测试2
	public static void main(String[] args) {
		Hero gareen = new Hero();
		gareen.name = "盖伦";
		gareen.hp = 616;
		gareen.damage = 50;
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

		Battle battle1 = new Battle(gareen, teemo);
		// 使用Runnable实现多线程时需创建对象调用start()方法
		new Thread(battle1).start();
		Battle battle2 = new Battle(ashe, leesin);
		new Thread(battle2).start();
	}
}
