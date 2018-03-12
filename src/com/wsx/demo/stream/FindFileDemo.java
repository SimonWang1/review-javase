package com.wsx.demo.stream;

import java.io.File;

public class FindFileDemo {
	// 查找指定文件夹不包含子文件夹的最大最小文件
	public static void main(String[] args) {
		// 声明文件和文件长度
		File minFile = null;
		File maxFile = null;
		long minSize = Integer.MAX_VALUE;
		long maxSize = 0;
		// 查找目录
		File f = new File("C:/windows");
		File[] files = f.listFiles();
		if(files == null)
			return;
		for(File file : files) {
			// 跳过文件夹只比较文件
			if(file.isDirectory())
				continue;
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
		System.out.format("最大文件是 %s ，大小为 %d 字节%n", maxFile.getAbsolutePath(), maxSize);
		System.out.format("最小文件是 %s ，大小为 %d 字节%n", minFile.getAbsolutePath(), minSize);
	}
}
