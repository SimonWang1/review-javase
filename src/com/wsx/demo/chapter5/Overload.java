package com.wsx.demo.chapter5;

public class Overload {
	public static void main(String[] args) {
		Overload ol = new Overload();
		ol.test();
		ol.test("Hello man");
	}
	
	public void test() {
		System.out.println("无参test方法");
	} 
	
	public void test(String msg) {
		System.out.println("重载的test方法：" + msg);
	}
}
