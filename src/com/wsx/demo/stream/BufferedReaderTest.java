package com.wsx.demo.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	// BufferedReader读取数据
	public static void main(String[] args) {
		// File找到指定文件
		File file = new File("D:/StreamFolder/ReadManyLine.txt");
		// 创建文件字符流
		try(FileReader fileReader = new FileReader(file);
			// 缓冲流，减少IO读取次数
			BufferedReader bufferedReader = new BufferedReader(fileReader)) {
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
