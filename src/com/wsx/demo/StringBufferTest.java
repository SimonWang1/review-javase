package com.wsx.demo;

public class StringBufferTest {
	// 对象引用指向内存
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Iphone");
		StringBuffer sb2 = new StringBuffer("Iphone");
		foo(sb);
		foo2(sb2);
		System.out.println(sb);
		System.out.println(sb2);
	}

	public static void foo(StringBuffer sb) {
		// 两个栈内存储存同一个堆内存地址，指向同一个堆内存，拼接操作
		sb.append(10);
	}

	public static void foo2(StringBuffer sb) {
		// 开辟新的堆内存，两个栈内存地址指向不同位置，原有堆内存不变
		// 未调用的堆内存成为垃圾被GC回收
		sb = new StringBuffer("Ipad");
	}
}
