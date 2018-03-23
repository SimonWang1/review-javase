package com.wsx.demo.multiple_thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
	// 使用Lock对象实现同步效果
	public static void main(String[] args) {
		// Lock接口引用指向实现类构造器，创建实现类对象
		Lock lock = new ReentrantLock();
		Thread thread1 = new Thread() {
			public void run() {
				boolean locked = false;
				try {
					log("线程启动");
					log("试图占有对象：lock");
					// trylock尝试占用，若失败，放弃占用
					locked = lock.tryLock(1, TimeUnit.SECONDS);
					if(locked) {
						log("占有对象：lock");
						log("进行5秒业务操作");
						Thread.sleep(5000);
					} else {
						log("经过1秒钟努力，还没有占有对象，放弃占有");
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					// 判断是否占用成功
					if(locked) {
						// lock实现对象同步效果要在finally代码块中unlock
						log("释放对象：lock");
						lock.unlock();
					}
				}
				log("线程结束");
			}
		};
		thread1.setName("thread1");
		thread1.start();
		
		try {
			// thread1运行2秒再开启thread2
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread thread2 = new Thread() {
			public void run() {
				boolean locked = false;
				try {
					log("线程启动");
					log("试图占有对象：lock");
					locked = lock.tryLock(1, TimeUnit.SECONDS);
					if(locked) {
					lock.lock();
						log("占有对象：lock");
						log("进行5秒业务操作");
						Thread.sleep(5000);
					} else {
						log("经过1秒钟努力，还没有占有对象，放弃占有");
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if(locked) {
						log("释放对象：lock");
						lock.unlock();
					}
				}
				log("线程结束");
			}
		};
		thread2.setName("thread2");
		thread2.start();
	}
	
	private static String now() {
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
	}
	
	private static void log(String message) {
		System.out.printf("%s %s %s %n", now(), Thread.currentThread().getName(), message);
	}
}
