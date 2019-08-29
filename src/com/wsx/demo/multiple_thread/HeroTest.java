package com.wsx.demo.multiple_thread;

public class HeroTest {
	// 单线程测试
	public static void main(String[] args) {
		Hero garen = new Hero("盖伦", 616, 50);
		Hero teemo = new Hero("提莫", 300, 30);
		Hero leesin = new Hero("李青", 455, 40);
		Hero ashe = new Hero("艾希", 320, 70);
		
		while (!teemo.isDead()) {
			garen.attackHero(teemo);
		}
		
		while (!leesin.isDead()) {
			ashe.attackHero(leesin);
		}
	}
}
