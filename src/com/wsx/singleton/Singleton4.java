package com.wsx.singleton;

public class Singleton4 {
	// Initialization Demand Holder
	// IoDH
	public static void main(String[] args) {
		// 在栈内存中创建Singleton引用变量s1, s2，此时变量为空
		Singleton4 s1, s2;
		// 通过类名调用getSingleton静态方法在堆内存中创建Singleton对象
		// 使用“=”将引用变量指向对象，即在栈内存中存储堆内存地址
		s1 = Singleton4.getSingleton4();
		s2 = Singleton4.getSingleton4();
		// 引用变量s1, s2存储地址相同，返回true
		System.out.println(s1 == s2);
	}

	// 私有静态内部类
	private static class Holder {
		private static Singleton4 singleton4 = new Singleton4();
	}

	// 公有静态方法，通过虚拟机创建唯一实例并保证线程安全，无线程锁性能没有影响
	public static Singleton4 getSingleton4() {
		return Holder.singleton4;
	}

	// 私有构造器
	private Singleton4() {
	}
}
