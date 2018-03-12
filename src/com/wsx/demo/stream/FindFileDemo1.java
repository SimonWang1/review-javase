package com.wsx.demo.stream;

import java.io.File;

public class FindFileDemo1 {
	// 递归查找指定文件夹包含子文件夹的最大最小文件
	// 声明文件和文件长度为静态全局变量
	private static File minFile = null;
	private static File maxFile = null;
	private static long minSize = Integer.MAX_VALUE;
	private static long maxSize = 0;
	
	public static void main(String[] args) {
		File file = new File("F:/BaiduNetdiskDownload");
		listFiles(file);
		System.out.format("最大文件是 %s ，大小是 %d 字节%n", 
				maxFile.getAbsolutePath(), maxFile.length());
		System.out.format("最小文件是 %s ，大小是 %d 字节%n",
				minFile.getAbsolutePath(), minFile.length());
	}
	
	// 递归查找
	private static void listFiles(File file) {
		// 若是文件
		if(file.isFile()) {
			// 找到最大文件
			if(file.length() > maxSize) {
				maxSize = file.length();
				maxFile = file;
			}
			// 找到不为零的最小文件
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
