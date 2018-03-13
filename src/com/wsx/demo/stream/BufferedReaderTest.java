package com.wsx.demo.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderTest {
	// BufferedReader读取数据，一次读取一行
	public static void main(String[] args) {
		// File找到指定文件
		File file = new File("D:/StreamFolder/read many line.txt");
		// 创建文件字符流
		try(Reader reader = new FileReader(file);
			// 缓存流，减少IO读取次数
			BufferedReader bufferedReader = new BufferedReader(reader)) {
			while(true) {
				String lines = bufferedReader.readLine();
				if(lines == null) {
					return;
				}
				System.out.println(lines);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
