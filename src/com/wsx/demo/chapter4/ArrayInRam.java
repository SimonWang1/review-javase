package com.wsx.demo.chapter4;

public class ArrayInRam {
	// 数组引用
	public static void main(String[] args) {
		int[] a = { 5, 2, 7, 9 };
		int[] b = new int[5];
		System.out.println("b的数组长度:" + b.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		b = a;
		// 赋值操作将数组a的地址存储到数组b的引用，未引用空数组b等待GC回收
		System.out.println("重新赋值之后的数组长度：" + b.length);
	}
}
