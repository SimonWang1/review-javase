package com.wsx.singleton;

//Initialization Demand Holder
//IoDH
public class Singleton_4 {
	public static void main(String[] args) {
		Singleton_4 s1, s2;
		s1 = Singleton_4.getSingleton4();
		s2 = Singleton_4.getSingleton4();
		System.out.println(s1==s2);
	}
	//私有静态内部类
	private static class Holder {
		private static Singleton_4 singleton_4 = new Singleton_4();
	}
	//公有静态方法，通过虚拟机创建唯一实例并保证线程安全，无线程锁性能没有影响
	public static Singleton_4 getSingleton4() {
		return Holder.singleton_4;
	}
	//私有构造器
	private Singleton_4() {
	}
}
