package com.wsx.demo.multiple_thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {
	// 多线程原子性
	private static int value = 0;
	private static AtomicInteger atomicValue = new AtomicInteger();
	public static void main(String[] args) {
		int number = 100000;
		// 普通自增
		Thread[] threads1 = new Thread[number];
		for(int i = 0; i < number; i++) {
			Thread thread = new Thread() {
				public void run() {
					value++;
				}
			};
			thread.start();
			threads1[i] = thread;
		}
		
		// 等待线程结束
		for(Thread thread : threads1) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("%d个线程进行value++后，value的值变成：%d%n", number, value);
		
		// 原子自增
		Thread[] threads2 = new Thread[number];
		for(int i = 0; i < number; i++) {
			Thread thread = new Thread() {
				public void run() {
					atomicValue.incrementAndGet();
				}
			};
			thread.start();
			threads2[i] = thread;
		}
		
		// 等待线程结束
		for(Thread thread : threads2) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("%d个线程进行atomicValue.incrementAndGet();后，value的值变成：%d%n", 
				number, atomicValue.intValue());
	}
}
