package com.wsx.demo.multiple_thread;

public class CustomThreadPoolTest2 {
	// 自定义线程池测试2
	public static void main(String[] args) {
		CustomThreadPool pool = new CustomThreadPool();
		int sleep = 1000;
		while(true) {
			pool.add(new Runnable() {
				@Override
				// 随着任务数量越来越多，线程池中的其他线程被唤醒执行任务
				public void run() {
					// TODO Auto-generated method stub
					// 可执行的任务
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			try {
				Thread.sleep(sleep);
				// sleep逐步减少至100
				sleep = sleep > 100 ? sleep - 100 : sleep;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
