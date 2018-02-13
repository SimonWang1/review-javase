package com.wsx.demo.stream;

import java.io.File;

public class FindFileDemo1 {
	// 使用递归查找指定文件夹包含子文件夹的最大最小文件
	static long minSize = Integer.MAX_VALUE;
	static long maxSize = 0;
	static File minFile = null;
	static File maxFile = null;
	
	public static void main(String[] args) {
		File file = new File("E:/downloads");
		listFiles(file);
		System.out.format("最大文件是 %s ，大小是 %d 字节%n", 
				maxFile.getAbsolutePath(), maxFile.length());
		System.out.format("最小文件是 %s ，大小是 %d 字节%n",
				minFile.getAbsolutePath(), minFile.length());
	}
	
	private static void listFiles(File file) {
		if(file.isFile()) {
			if(file.length() > maxSize) {
				maxSize = file.length();
				maxFile = file;
			}
			if(file.length() != 0 && file.length() < minSize) {
				minSize = file.length();
				minFile = file;
			}
		}
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			if(files != null) {
				for(File f : files) {
					// 递归调用
					listFiles(f);
				}
			}
		}
	}
}
