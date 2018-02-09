package com.wsx.demo.exception;

public class ErrorTest {
	// Error指系统级别的异常，通常指堆栈溢出
	public static void main(String[] args) {
		// OutOfMemoryError: 堆内存溢出
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < Integer.MAX_VALUE; i++) {
			sb.append(i);
		}
	}
}
