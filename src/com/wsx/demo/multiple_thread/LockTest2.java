package com.wsx.demo.multiple_thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest2 {
	// 使用Lock对象实现线程交互
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		// 通过lock对象得到condition对象，调用condition的await，signal，signalAll方法
		// 对应synchronized中的wait，notify，notifyAll方法
		// 使用lock可以规避死锁，要在finally中unlock
		Condition condition = lock.newCondition();

		Thread thread1 = new Thread() {
			public void run() {
				try {
					log("线程启动");
					log("试图占有对象：lock");
					lock.lock();
					log("占有对象：lock");
					log("进行5秒业务操作");
					Thread.sleep(5000);
					log("临时释放对象 lock，并等待");
					condition.await();
					log("重新占有对象 lock，并进行5秒钟的业务操作");
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					log("释放对象：lock");
					lock.unlock();
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
				try {
					log("线程启动");
					log("试图占有对象：lock");
					lock.lock();
					log("占有对象：lock");
					log("进行5秒业务操作");
					Thread.sleep(5000);
					log("唤醒等待中的线程");
					condition.signal();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					log("释放对象：lock");
					lock.unlock();
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
