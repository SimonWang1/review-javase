package com.wsx.singleton;

//Simple
public class Singleton_1 {
	public static void main(String[] args) {
		Singleton_1 s1, s2;
		s1 = Singleton_1.getSingleton1();
		s2 = Singleton_1.getSingleton1();
		System.out.println(s1 == s2);
	}
	//私有静态变量，存储唯一实例
	private static Singleton_1 singleton_1 = null;
	//公有静态方法，返回唯一实例
	public static Singleton_1 getSingleton1() {
		if (singleton_1 == null)
			singleton_1 = new Singleton_1();
		return singleton_1;
	}
	//私有构造器
	private Singleton_1() {
	}	
}
