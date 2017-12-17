package com.wsx.chapterdemo5;

public class Overload {
	public static void main(String[] args) {
		Overload ol = new Overload();
		ol.test();
		ol.test("Hello man");
	}
	
	public void test() {
		System.out.println("无参构造器");
	} 
	
	public void test(String msg) {
		System.out.println("重载的test方法 " + msg);
	}
}
