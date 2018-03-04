package com.wsx.demo.chapter6;

interface interfaceA{
	int PROP_A = 5;
	void testA();
}

interface interfaceB{
	int PROP_B = 6;
	void testB();
}

interface interfaceC extends interfaceA, interfaceB{
	int PROP_C = 7;
	void testC();
}
public class InterfaceExtendsTest {
	// 接口之间通过继承拓展，充分利用单继承多实现的设计思想编写接口完成功能，实现代码复用
	public static void main(String[] args) {
		System.out.println(interfaceC.PROP_A);
		System.out.println(interfaceC.PROP_B);
		System.out.println(interfaceC.PROP_C);
	}
}
