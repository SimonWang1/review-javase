package com.wsx.demo.multiple_thread;

public class InteractiveTest2 {
	// 线程交互测试2
	public static void main(String[] args) {
		I_Hero garen = new I_Hero();
		garen.name = "盖伦";
		garen.hp = 767;
		
		Thread thread = new Thread() {
			public void run() {
				while(true) {
					garen.hurt();
					try {
						// 掉血频率低，执行hurt()时触发notify()，解除同步对象wait()所在线程的等待命令
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		thread.start();
		
		Thread thread2  = new Thread() {
			public void run() {
				while(true) {
					garen.recover();
					try {
						// 回血频率更高，血量为1000时执行wait()，释放同步对象占有的线程并等待
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		thread2.start();
	}
}
