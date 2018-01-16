package com.wsx.singleton;

// Double Checked Locking
public class Singleton3 {
	public static void main(String[] args) {
		Singleton3 s1, s2;
		s1 = Singleton3.getSingleton3();
		s2 = Singleton3.getSingleton3();
		System.out.println(s1 == s2);
	}

	// DCL需要使用volatile关键字私有静态变量保证唯一性，但会影响性能
	private static volatile Singleton3 singleton3 = null;

	public static Singleton3 getSingleton3() {
		// 定义一个临时变量，在 Singleton3 不为空的时候（这是绝大部分的情况），
		// 只要在开始访问一次 volatile 变量，返回的是临时变量。如果没有此临时变量，
		// 则需要访问两次，而降低了效率。
		Singleton3 singleton = singleton3;
		// 一重判断
		if (singleton == null) {
			// 锁定代码块
			synchronized (Singleton3.class) {
				singleton = singleton3;
				// 二重判断
				if (singleton == null) {
					singleton = new Singleton3();
					singleton3 = singleton;
				}
			}
		}
		return singleton3;
	}

	private Singleton3() {
	}
}
