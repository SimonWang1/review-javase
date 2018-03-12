package com.wsx.demo.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CloseStreamTest {
	// 在finally中关闭流
	public static void main(String[] args) {
		File file = new File("D:/StreamFolder/stream.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			byte[] all = new byte[(int)file.length()];
			fis.read(all);
			for(byte b : all) {
				System.out.println(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
