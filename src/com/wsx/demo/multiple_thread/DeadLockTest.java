package com.wsx.demo.multiple_thread;

public class DeadLockTest {
	// 死锁测试
	public static void main(String[] args) {
		final Hero ahri = new Hero("阿狸");
		final Hero annie = new Hero("安妮");
		
		Thread thread1 = new Thread() {
			public void run() {
				// 占有阿狸
				synchronized(ahri) {
					System.out.println("thread1 已经占有阿狸");
					try {
						// thread1暂停1000ms，让另一个线程有足够时间占有安妮
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("thread1 试图占有安妮");
					System.out.println("thread1 等待中。。。");
					synchronized(annie) {
						System.out.println("do something");
					}
				}
			}
		};
		thread1.start();
		
		Thread thread2 = new Thread() {
			public void run() {
				// 占有安妮
				synchronized(annie) {
					System.out.println("thread2 已经占有安妮");
					try {
						// thread2暂停1000ms，让另一个线程有足够时间占有阿狸
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("thread2 试图占有阿狸");
					System.out.println("thread2 等待中。。。");
					synchronized(ahri) {
						System.out.println("do something");
					}
				}
			}
		};
		thread2.start();
	}
}
