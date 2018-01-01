package com.wsx.demo.chapter5_1;

public class ConversionTest {
	public static void main(String[] args) {
		double d = 3.14;
		long l = (long)d;
		System.out.println(l);
//		int in = 5;
		//不同类型之间不能相互转换
//		boolean b = (boolean)in;
		Object obj = "Hello";
		//Object类和String之间存在继承关系，可以转换
		String objStr = (String)obj;
		System.out.println(objStr);
	}
}
