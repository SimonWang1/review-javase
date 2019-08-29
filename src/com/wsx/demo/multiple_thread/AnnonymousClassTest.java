package com.wsx.demo.multiple_thread;

public class AnnonymousClassTest {
	// 匿名类多线程
	public static void main(String[] args) {
		Hero garen = new Hero("盖伦", 616, 50);
		Hero teemo = new Hero("提莫", 300, 30);
		Hero leesin = new Hero("李青", 455, 40);
		Hero ashe = new Hero("艾希", 320, 70);
		
		// Thread匿名类实现多线程
		Thread thread1 = new Thread() {
			public void run() {
				while (!teemo.isDead()) {
					garen.attackHero(teemo);
				}
			}
		};
		thread1.start();
		
		// 不使用引用
		new Thread() {
			public void run() {
				while (!leesin.isDead()) {
					ashe.attackHero(leesin);
				}
			}
		}.start();
		
		// Runnable匿名类实现多线程
		Runnable runnable = new Runnable() {
			public void run() {
				while (!ashe.isDead()) {
					teemo.attackHero(ashe);
				}
			}
		};
		Thread thread3 = new Thread(runnable);
		thread3.start();
		
		// 不使用引用
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (!ashe.isDead()) {
					teemo.attackHero(ashe);
				}
			}
		}).start();
		
		// Lambda表达式
		new Thread(() -> {
			while (!teemo.isDead()) {
				ashe.attackHero(teemo);
			}
		}).start();
	}
}
