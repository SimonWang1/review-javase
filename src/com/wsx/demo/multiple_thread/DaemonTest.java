package com.wsx.demo.multiple_thread;

public class DaemonTest {
	// 守护线程测试
	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				int seconds = 0;
				System.out.println("计时开始：");
				while(true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("第" + seconds++ + "秒");
				}
			}
		};
		// 设置此线程为守护线程，当所有线程都是守护线程时，线程结束
		thread.setDaemon(true);
		thread.start();
	}
}
