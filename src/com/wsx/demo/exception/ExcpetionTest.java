package com.wsx.demo.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcpetionTest {
	// 文件不存在异常
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		File f = new File("d:\\stream.txt");
		try {
			System.out.println("试图打开 d:\\stream.txt");
			new FileInputStream(f);
			System.out.println("成功打开");
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("文件不存在");
			e.printStackTrace();
		}
	}
}
