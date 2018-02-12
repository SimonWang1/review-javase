package com.wsx.demo.stream;

import java.io.File;

public class FindFile {
	// 查找指定文件夹不包含子文件夹的最大最小文件
	public static void main(String[] args) {
		long minSize = Integer.MAX_VALUE;
		long maxSize = 0;
		File minFile = null;
		File maxFile = null;
		File f = new File("C:/windows");
		File[] files = f.listFiles();
		if(files == null)
			return;
		for(File file : files) {
			if(file.isDirectory())
				continue;
			if(file.length() > maxSize) {
				maxSize = file.length();
				maxFile = file;
			}
			if(file.length() != 0 && file.length() < minSize) {
				minSize = file.length();
				minFile = file;
			}
		}
		System.out.format("最大文件是 %s ，大小为 %d 字节%n", maxFile.getAbsolutePath(), maxSize);
		System.out.format("最小文件是 %s ，大小为 %d 字节%n", minFile.getAbsolutePath(), minSize);
	}
}
