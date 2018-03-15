package com.wsx.demo.multiple_thread;

public class InteractiveTest {
	// 线程交互测试
	public static void main(String[] args) {
		I_Hero tryndamere = new I_Hero();
		tryndamere.name = "泰达米尔";
		tryndamere.hp = 767;
		
		Thread thread = new Thread() {
			public void run() {
				while(true) {
					tryndamere.hurt();
					try {
						// 掉血频率更高，血量为1时执行wait()，释放同步对象占有的线程并等待
						Thread.sleep(10);
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
					tryndamere.recover();
					try {
						// 回血频率低，执行recover()时触发notify()，解除同步对象wait()所在线程的等待命令
						Thread.sleep(100);
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
