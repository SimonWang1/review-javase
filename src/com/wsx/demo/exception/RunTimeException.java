package com.wsx.demo.exception;

public class RunTimeException {
	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {
		// 运行时异常，因发生条件过多无需处理的异常，发生异常会在控制台打印异常信息
		// ArithmeticException: 除数不能为零
		int j = 5 / 0;
		// ArrayIndexOutOfBoundsException: 下标越界异常
		int[] k = new int[5];
		k[10] = 10;
		// NullPointerException: 空指针异常
		String str = null;
		str.length();
	}
}
