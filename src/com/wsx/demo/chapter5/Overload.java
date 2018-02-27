package com.wsx.demo.chapter5;

public class Overload {
	// 方法重载，方法相同，形参个数不同
	public static void main(String[] args) {
		Overload ol = new Overload();
		ol.test();
		ol.test("Hey, guys");
	}
	
	public void test() {
		System.out.println("无参test方法");
	} 
	
	public void test(String msg) {
		System.out.println("重载的test方法：" + msg);
	}
}
