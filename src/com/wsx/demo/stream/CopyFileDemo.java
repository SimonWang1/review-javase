package com.wsx.demo.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
	// 文件复制
	public static void main(String[] args) {
		copyFile("D:/StreamFolder/stream3.txt", "D:/StreamFolder/stream3_copy.txt");
	}

	/*
	 * @param srcPath 源文件
	 * @param destPath 目标文件
	 */
	public static void copyFile(String srcPath, String destPath) {
		File srcFile = new File(srcPath);
		File destFile = new File(destPath);

		// 缓冲区一次读取1024字节
		byte[] buffer = new byte[1024];

		try (FileInputStream fileInputStream = new FileInputStream(srcFile);
				FileOutputStream fileOutputStream = new FileOutputStream(destFile);) {
			while (true) {
				// 实际读取长度actuallyReaded有可能小于1024
				int actuallyReaded = fileInputStream.read(buffer);
				if (actuallyReaded == -1)
					break;
				fileOutputStream.write(buffer, 0, actuallyReaded);
				fileOutputStream.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
