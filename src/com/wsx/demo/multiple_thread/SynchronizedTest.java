package com.wsx.demo.multiple_thread;

public class SynchronizedTest {
	// 多线程同步测试
	public static void main(String[] args) {
		final S_Hero garen = new S_Hero();
		garen.name = "盖伦";
		garen.hp = 10000;
		System.out.printf("盖伦的初始血量是 %.0f%n", garen.hp);
		
		int n = 10000;
		
		Thread[] addThreads = new Thread[n];
		Thread[] reduceThreads = new Thread[n];
		
		// n个线程增加hp
		for(int i = 0; i < n; i++) {
			Thread thread = new Thread() {
				public void run() {
					garen.recover();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			thread.start();
			addThreads[i] = thread;
		}
		
		// n个线程减少hp
		for(int i = 0; i < n; i++) {
			Thread thread = new Thread() {
				public void run() {
					garen.hurt();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			thread.start();
			reduceThreads[i] = thread;
		}
		
		// 等待所有增加hp线程结束
		for(Thread thread : addThreads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// 等待所有减少hp线程结束
		for(Thread thread : reduceThreads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.printf("%d 个增加线程和 %d 个减少线程结束后%n盖伦的血量变成了 %.0f%n", n, n, garen.hp);
	}
}
