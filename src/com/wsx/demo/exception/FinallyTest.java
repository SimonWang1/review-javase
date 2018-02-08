package com.wsx.demo.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FinallyTest {
	// finally代码块
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		File f = new File("d:\\stream.txt");
		try {
			System.out.println("试图打开 d:\\stream.txt");
			new FileInputStream(f);
			System.out.println("成功打开");
		}
		catch (FileNotFoundException e) {
			System.out.println("文件不存在");
			e.printStackTrace();
		}
		finally {
			System.out.println("finally代码块中的内容总是被执行");
		}
	}
}
