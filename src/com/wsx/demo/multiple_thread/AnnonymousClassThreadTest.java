package com.wsx.demo.multiple_thread;

public class AnnonymousClassThreadTest {
	// 多线程测试3
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

		// 使用Thread匿名类实现多线程
		Thread thread1 = new Thread() {
			// 在run()方法中编写逻辑
			public void run() {
				while(!teemo.isDead()) {
					// JDK1.7以后调用外部局部变量时无需使用final声明
					gareen.attackHero(teemo);
				}
			}
		};
		thread1.start();
		
		Thread thread2 = new Thread() {
			public void run() {
				while(!leesin.isDead()) {
					ashe.attackHero(leesin);
				}
			}
		};
		thread2.start();
	}
}
