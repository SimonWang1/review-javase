package com.wsx.singleton;

//Initialization Demand Holder
//IoDH
public class Singleton4 {
	public static void main(String[] args) {
		Singleton4 s1, s2;
		s1 = Singleton4.getSingleton4();
		s2 = Singleton4.getSingleton4();
		System.out.println(s1==s2);
	}
	//私有静态内部类
	private static class Holder {
		private static Singleton4 singleton4 = new Singleton4();
	}
	//公有静态方法，通过虚拟机创建唯一实例并保证线程安全，无线程锁性能没有影响
	public static Singleton4 getSingleton4() {
		return Holder.singleton4;
	}
	//私有构造器
	private Singleton4() {
	}
}
