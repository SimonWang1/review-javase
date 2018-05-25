package com.wsx.demo.chapter6;

public interface InterfaceStandard {
	// 接口规范
	// 接口定义的成员变量只能是常量
	int MAX_CACHE_LINE = 50;

	// 普通抽象方法
	public void out();

	public void getData(String msg);

	// Java8新特性
	// 在接口中定义默认方法，需要使用default修饰
	default void print(String... msgs) {
		for (String msg : msgs) {
			System.out.println(msg);
		}
	}

	// 在接口中定义默认方法，需要使用default修饰
	default void test() {
		System.out.println("默认的test()方法");
	}

	// 在接口中定义类方法，需要使static修饰
	public static String staticTest() {
		return "接口里的方法";
	}
}
