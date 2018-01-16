package com.wsx.singleton;

// Simple
public class Singleton1 {
	public static void main(String[] args) {
		Singleton1 s1, s2;
		s1 = Singleton1.getSingleton1();
		s2 = Singleton1.getSingleton1();
		System.out.println(s1 == s2);
	}

	// 私有静态变量，存储唯一实例
	private static Singleton1 singleton1 = null;

	// 公有静态方法，返回唯一实例
	public static Singleton1 getSingleton1() {
		if (singleton1 == null)
			singleton1 = new Singleton1();
		return singleton1;
	}

	// 私有构造器
	private Singleton1() {
	}
}
