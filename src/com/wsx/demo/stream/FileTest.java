package com.wsx.demo.stream;

import java.io.File;
import java.sql.Date;

public class FileTest {
	// File类常用方法
	public static void main(String[] args) {
		// getAbsolutePath(): 若引用是文件夹，获取文件夹绝对路径
		File file1 = new File("d:/StreamFolder");
		System.out.println("file1的绝对路径：" + file1.getAbsolutePath());
		// getAbsolutePath(): 若引用是文件，获取文件所在文件夹绝对路径
		File file2 = new File("stream.txt");
		System.out.println("file2的绝对路径：" + file2.getAbsolutePath());
		// 使用f1作为父目录创建文件对象
		File file3 = new File(file1, "Stream.txt");
		System.out.println("file3的绝对路径：" + file3.getAbsolutePath());
		System.out.println("--------------------------------------------");
		File file = new File("d:/StreamFolder/stream.txt");
		System.out.println("当前文件是：" + file);
		// exists(): 判断文件是否存在
		System.out.println("文件是不是存在：" + file.exists());
		// isDirectory(): 判断是不是文件夹
		System.out.println("是不是文件夹：" + file.isDirectory());
		// isFile(): 判断是不是文件
		System.out.println("是不是文件：" + file.isFile());
		// length(): 文件长度
		System.out.println("文件长度：" + file.length());
		// lastModified(): 文件最后修改时间
		long time = file.lastModified();
		Date date = new Date(time);
		System.out.println("文件最后修改时间：" + date);
		// setLastModified(time): 设置文件修改时间为1970.1.1 08:00:00
		file.setLastModified(0);
	}	
}
