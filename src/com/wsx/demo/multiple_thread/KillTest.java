package com.wsx.demo.multiple_thread;

public class KillTest {
	// 多线程测试1
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
		
		Kill kill1 = new Kill(garen, teemo);
		// 线程start同时运行线程类中run()
		kill1.start();
		Kill kill2 = new Kill(ashe, leesin);
		kill2.start();
	}
}
