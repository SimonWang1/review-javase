package com.wsx.demo.multiple_thread;

public class JoinTest {
	// join()方法测试
	public static void main(String[] args) {
		Hero garen = new Hero("盖伦", 616, 50);
		Hero teemo = new Hero("提莫", 300, 30);
		Hero leesin = new Hero("李青", 455, 40);
		Hero ashe = new Hero("艾希", 320, 70);

		Thread thread1 = new Thread() {
			public void run() {
				while(!teemo.isDead()) {
					garen.attackHero(teemo);
				}
			}
		};
		thread1.start();
		
		try {
			// 将thread1 join到main thread，只有在thread1执行完毕后再顺序执行thread2
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
