package com.wsx.demo.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
	// FileInputStream读取字节流文本
	public static void main(String[] args) {
		try {
			// File类找到指定文件
			File file = new File("D:/StreamFolder/stream.txt");
			// 创建注入指定文件的文件输入流
			FileInputStream fis = new FileInputStream(file);
			// 创建长度是文件大小的字节数组
			byte[] all = new byte[(int)file.length()];
			// 以字节流的方式读取文件内容
			fis.read(all);
			for(byte b : all) {
				// 打印文件内容
				System.out.println(b);
			}
			// 关闭输入流节省资源
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
