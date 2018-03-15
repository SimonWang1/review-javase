package com.wsx.demo.multiple_thread;

public class CustomThreadPoolTest {
	// 自定义线程池测试
	public static void main(String[] args) {
		CustomThreadPool pool = new CustomThreadPool();
		
		for(int i = 0; i < 5; i++) {
			Runnable task = new Runnable() {
				@Override
				public void run() {
					// 可执行的任务
				}
			};
			pool.add(task);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
