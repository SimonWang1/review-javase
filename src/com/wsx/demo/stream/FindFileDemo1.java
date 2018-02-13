package com.wsx.demo.stream;

import java.io.File;

public class FindFileDemo1 {
	// 使用递归查找指定文件夹包含子文件夹的最大最小文件
	// 声明文件和文件大小为静态全局变量方便调用
	static File minFile = null;
	static File maxFile = null;
	static long minSize = Integer.MAX_VALUE;
	static long maxSize = 0;
	
	public static void main(String[] args) {
		File file = new File("E:/downloads");
		listFiles(file);
		System.out.format("最大文件是 %s ，大小是 %d 字节%n", 
				maxFile.getAbsolutePath(), maxFile.length());
		System.out.format("最小文件是 %s ，大小是 %d 字节%n",
				minFile.getAbsolutePath(), minFile.length());
	}
	
	// 查找方法
	private static void listFiles(File file) {
		// 若是文件
		if(file.isFile()) {
			// 找到最大文件
			if(file.length() > maxSize) {
				maxSize = file.length();
				maxFile = file;
			}
			// 找到最小文件
			if(file.length() != 0 && file.length() < minSize) {
				minSize = file.length();
				minFile = file;
			}
		}
		// 若是文件夹
		if(file.isDirectory()) {
			// 声明文件夹内容
			File[] files = file.listFiles();
			// 若不为空
			if(files != null) {
				// 遍历内容
				for(File f : files) {
					// 递归调用
					listFiles(f);
				}
			}
		}
	}
}
