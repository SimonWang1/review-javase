package com.wsx.singleton;

//语义线程安全
public class Singleton_2 {
	private static volatile Singleton_2 singleton_2 = null;

	private Singleton_2() {
	}

	public static Singleton_2 getSingleton2() {
		synchronized (Singleton_2.class) {
			if (singleton_2 == null) {
				singleton_2 = new Singleton_2();
			}
		}
		return singleton_2;
	}

	public static void main(String[] args) {
		Singleton_2 s1, s2;
		s2 = Singleton_2.getSingleton2();
		s1 = Singleton_2.getSingleton2();
		System.out.println(s1 == s2);
	}
}
