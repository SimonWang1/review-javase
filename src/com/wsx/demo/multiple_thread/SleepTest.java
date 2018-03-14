package com.wsx.demo.multiple_thread;

public class SleepTest {
	// sleep()方法测试
	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				int seconds = 0;
				System.out.println("计时开始：");
				while(true) {
					try {
						// 表示当前线程暂停1000ms
						Thread.sleep(1000);
						// 抛出中断异常
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("第" + seconds++ + "秒");
				}
			}
		};
		thread.start();
	}
}
