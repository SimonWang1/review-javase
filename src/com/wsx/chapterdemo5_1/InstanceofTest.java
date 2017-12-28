package com.wsx.chapterdemo5_1;

public class InstanceofTest {
	public static void main(String[] args) {
		//使用Object类声明hello，hello的编译时类型是Object
		//hello的实际类型是String
		Object hello = "Hello";
		//String与Object存在继承关系，可以判断，返回ture
		System.out.println("字符串是否是Object类的实例："
				+ (hello instanceof Object));
		//Math与Object存在继承关系，可以判断，返回false
		System.out.println("字符串是否是Math类的实例："
				+ (hello instanceof Math));
		System.out.println("字符串是否是String类的实例："
				+ (hello instanceof String));
		//String实现了Comparable接口，返回true
		System.out.println("字符串是否是Comparable的实例："
				+ (hello instanceof Comparable));
//		String a = "Hello";
//		String与Math不存在继承关系，编译错误
//		System.out.println("字符串是否是Math类的实例："
//				+ (a instanceof Math));
	}
}
