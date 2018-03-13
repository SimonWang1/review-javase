package com.wsx.demo.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CloseStreamTest {
	// 在finally中关闭流
	public static void main(String[] args) {
		File file = new File("D:/StreamFolder/stream.txt");
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
			byte[] all = new byte[(int)file.length()];
			inputStream.read(all);
			for(byte b : all) {
				System.out.println(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
