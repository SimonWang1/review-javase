package com.wsx.demo.multiple_thread;

public class KillTest {
	// 继承Thread类实现多线程测试
	public static void main(String[] args) {
		Hero garen = new Hero("盖伦", 616, 50);
		Hero teemo = new Hero("提莫", 300, 30);
		Hero leesin = new Hero("李青", 455, 40);
		Hero ashe = new Hero("艾希", 320, 70);
		Kill kill1 = new Kill(garen, teemo);
		// 线程start同时运行线程类中run()
		kill1.start();
		// 不使用引用
		new Kill(ashe, leesin).start();
	}
}
