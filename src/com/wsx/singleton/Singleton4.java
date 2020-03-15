package com.wsx.singleton;

public class Singleton4 {
	// Initialization Demand Holder 初始化代码块 IoDH
	public static void main(String[] args) {
		Singleton4 s1 = Singleton4.getSingleton4();
		Singleton4 s2 = Singleton4.getSingleton4();
		System.out.println(s1 == s2);
	}

	// 公有静态方法，供调用获取唯一类对象
	public static Singleton4 getSingleton4() {
		return Holder.singleton;
	}

	// 私有静态内部类，编译时通过虚拟机创建唯一对象并保证线程安全，无线程锁性能没有影响
	private static class Holder {
		private static Singleton4 singleton = new Singleton4();
	}

	// 私有构造器
	private Singleton4() {}
}
