package com.wsx.demo.stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	// FileReader读取文件字符流
	public static void main(String[] args) {
		File file = new File("D:/StreamFolder/stream.txt");
		try(FileReader fr = new FileReader(file)){
			// 创建长度是文件大小的字符数组
			char[] all = new char [(char)file.length()];
			fr.read(all);
			for(char c : all) {
				System.out.print(c);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
