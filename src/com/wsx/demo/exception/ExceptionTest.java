package com.wsx.demo.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
	// try catch捕获处理文件不存在异常
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		File f = new File("d:/stream.txt");
		try {
			// 可查异常需要进行try catch或throws操作，否则编译器不允许执行
			System.out.println("试图打开 d:/stream.txt");
			new FileInputStream(f);
			System.out.println("成功打开");
		}
		// 可使用FileNotFoundException间接父类Exception声明报错类型
		// 也可用Exception的父类Throwable声明
		catch (FileNotFoundException e) {
			System.out.println("文件不存在");
			// 追踪栈打印异常位置
			e.printStackTrace();
		}
	}
}
