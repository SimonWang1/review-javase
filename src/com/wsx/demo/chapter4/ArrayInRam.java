package com.wsx.demo.chapter4;

public class ArrayInRam {
	public static void main(String[] args){
		int[] a = {5,2,7,9};
		int[] b = new int[5];
		System.out.println("b的数组长度:" + b.length);
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		b = a;
//		因为赋值操作修改了数组B的地址指向数组A，数组B本身的长度没有变化，没有引用等待GC回收
		System.out.println("重新赋值之后的数组长度:" + b.length);
	}
}
