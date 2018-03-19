package com.wsx.demo.multiple_thread;

public class InteractiveTest3 {
	// 多线程交互测试
	public static void main(String[] args) {
		final I_Hero garen = new I_Hero();
		garen.name = "盖伦";
		garen.hp = 616;
		
		for(int i = 0; i < 2; i++) {
			new HurtThread(garen).start();
		}
		
		for(int i = 0; i < 5; i++) {
			new RecoverThread(garen).start();
		}
	}
	
	// 掉血线程类
	private static class HurtThread extends Thread{
		private I_Hero hero;
		
		public void run() {
			while(true) {
				hero.hurt();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		public HurtThread(I_Hero hero) {
			this.hero = hero;
		}
	}
	
	// 回血线程类
	private static class RecoverThread extends Thread{
		private I_Hero hero;
		
		public void run() {
			while(true) {
				hero.recover();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		public RecoverThread(I_Hero hero) {
			this.hero = hero;
		}
	}
}
