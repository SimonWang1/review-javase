package com.wsx.singleton;

//¾²Ì¬ÄÚ²¿Àà
//Initialization Demand Holder
//IoDH
public class Singleton_4 {
	public static void main(String[] args) {
		Singleton_4 s1, s2;
		s1 = Singleton_4.getSingleton4();
		s2 = Singleton_4.getSingleton4();
		System.out.println(s1==s2);
	}
	
	private static class Holder {
		private static Singleton_4 singleton_4 = new Singleton_4();
	}

	public static Singleton_4 getSingleton4() {
		return Holder.singleton_4;
	}

	private Singleton_4() {
	}
}
