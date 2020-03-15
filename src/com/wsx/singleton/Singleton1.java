package com.wsx.singleton;

public class Singleton1 {
	// 静态方法实现单例
	public static void main(String[] args) {
		Singleton1 s1 = Singleton1.getSingleton1();
		Singleton1 s2 = Singleton1.getSingleton1();
		System.out.println(s1 == s2);
	}

	// 私有静态类引用，用于指向唯一类对象
	private static Singleton1 singleton = null;

	// 公有静态方法，供调用获取唯一类对象
	public static Singleton1 getSingleton1() {
		if (singleton == null) {
			singleton = new Singleton1();
		}
		return singleton;
	}

	// 私有构造器
	private Singleton1() {}
}
