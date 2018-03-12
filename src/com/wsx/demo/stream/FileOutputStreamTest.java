package com.wsx.demo.stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	// FileOutputStream写出字节流文本
	public static void main(String[] args) {
		try {
			// 创建文本绝对路径和文件名
			File file = new File("D:/StreamFolder/stream2.txt");
			// 创建长度是2的字节数组，存储X, Y的ASCll码
			byte[] data = {88, 89};
			// 创建注入指定文件的文件输出流
			FileOutputStream fos = new FileOutputStream(file);
			// 将字节数组写进输出流
			fos.write(data);
			// 关闭输出流节省资源
			fos.close();
			System.out.println("创建完成");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
