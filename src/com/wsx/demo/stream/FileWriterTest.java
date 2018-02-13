package com.wsx.demo.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	// FileWriter写出字符文本
	public static void main(String[] args) {
		File file = new File("D:/StreamFolder/Stream3.txt");
		try(FileWriter fw = new FileWriter(file)){
			String sentence = "OK. That's right! ";
			char[] c = sentence.toCharArray();
			fw.write(c);
			System.out.println("写出成功");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
