package com.wsx.demo.multiple_thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SynchronizedTest2 {
	// synchronized测试
	public static void main(String[] args) {
		final Object someObject = new Object();
		
		Thread thread1 = new Thread() {
			public void run() {
				try {
					System.out.println(now() + " thread1 线程已运行");
					System.out.println(now() + this.getName() + " 试图占有对象：someObject");
					// thread1独占someObject对象，5000ms后释放
					synchronized (someObject) {
						System.out.println(now() + this.getName() + " 占有对象：someObject");
						Thread.sleep(5000);
						System.out.println(now() + this.getName() + " 释放对象：someObject"); 
					}
					System.out.println(now() + " thread1 线程结束");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		thread1.setName(" thread1");
		thread1.start();
		
		Thread thread2 = new Thread() {
			public void run() {
				try {
					System.out.println(now() + " thread2 线程已运行");
					System.out.println(now() + this.getName() + " 试图占有对象：someObject");
					// thread2独占someObject对象，5000ms后释放
					synchronized(someObject) {
						System.out.println(now() + this.getName() + " 占有对象：someObject");
						Thread.sleep(5000);
						System.out.println(now() + this.getName() + " 释放对象：someObject");
					}
					System.out.println(now() + " thread2 线程结束");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		thread2.setName(" thread2");
		thread2.start();
	}
	
	// 当前时间格式化，HH表示24小时制
	public static String now() {
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
	}
}
