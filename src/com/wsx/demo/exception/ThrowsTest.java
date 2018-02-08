package com.wsx.demo.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsTest {
	// throws抛出异常
	public static void main(String[] args) {
		// 主方法调用
		method1();
	}
	
	private static void method1() {
		try {
			method2();
			// method1进行异常处理
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// method2抛出文件未找到异常
	@SuppressWarnings("resource")
	private static void method2() throws FileNotFoundException{
		File f = new File("d:\\stream.txt");
		System.out.println("试图打开 d:\\stream.txt");
		new FileInputStream(f);
		System.out.println("成功打开");
	}
}
