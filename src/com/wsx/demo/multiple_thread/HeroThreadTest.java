package com.wsx.demo.multiple_thread;

public class HeroThreadTest {
	// 单线程测试
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
		
		while(!teemo.isDead()) {
			gareen.attackHero(teemo);
		}
		
		while(!leesin.isDead()) {
			ashe.attackHero(leesin);
		}
	}
}
