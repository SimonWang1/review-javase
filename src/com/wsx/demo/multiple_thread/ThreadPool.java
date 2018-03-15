package com.wsx.demo.multiple_thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
	// JDK自带线程池测试
	public static void main(String[] args) {
		// 五个参数分别表示：
		// corePoolSize: 初始化线程数
		// maximumPoolSize: 若初始化线程不够用，自动增加最大线程数
		// keepAliveTime: 回收多余线程秒数，多余线程超过秒数未被使用，回收线程值初始化个数
		// unit: 同上
		// workQueue: 用来存放任务的集合
		ThreadPoolExecutor threadPool = new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS, 
				new LinkedBlockingQueue<Runnable>());
		// execute(): 用于添加任务
		threadPool.execute(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("task1");
			}
		});
	}
}
