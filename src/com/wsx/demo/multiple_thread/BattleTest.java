package com.wsx.demo.multiple_thread;

public class BattleTest {
	// 实现Runnable接口实现多线程测试
	public static void main(String[] args) {
		Hero garen = new Hero("盖伦", 616, 50);
		Hero teemo = new Hero("提莫", 300, 30);
		Hero leesin = new Hero("李青", 455, 40);
		Hero ashe = new Hero("艾希", 320, 70);
		// 创建实现Runnable接口类对象
		Battle battle1 = new Battle(garen, teemo);
		// 使用Runnable实现多线程时需创建线程对象调用start()
		new Thread(battle1).start();
		// 不使用引用
		new Thread(new Battle(ashe, leesin)).start();
	}
}
