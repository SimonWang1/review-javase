package com.wsx.singleton;

//Double Checked Locking
public class Singleton_3 {
	public static void main(String[] args) {
		Singleton_3 s1, s2;
		s1 = Singleton_3.getSingleton3();
		s2 = Singleton_3.getSingleton3();
		System.out.println(s1==s2);
	}
	
	private static volatile Singleton_3 singleton_3 = null;

	public static Singleton_3 getSingleton3() {
		// 定义一个临时变量，在 Singleton3 不为空的时候（这是绝大部分的情况），
		// 只要在开始访问一次 volatile 变量，返回的是临时变量。如果没有此临时变量，
		// 则需要访问两次，而降低了效率。
		Singleton_3 singleton = singleton_3;
		if (singleton == null) {
			synchronized (Singleton_3.class) {
				singleton = singleton_3;
				if (singleton == null) {
					singleton = new Singleton_3();
					singleton_3 = singleton;
				}
			}
		}
		return singleton_3;
	}
	
	private Singleton_3() {
	}
}
