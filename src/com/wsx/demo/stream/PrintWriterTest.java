package com.wsx.demo.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
	// BufferedWriter写出数据，一次写出一行
	public static void main(String[] args) {
		// 创建文件绝对路径和文件名
		File file = new File("D:/StreamFolder/hot game.txt");
		// 创建文件字符流
		try(FileWriter fileWriter = new FileWriter(file);
			// 缓存流，减少IO写出次数
			PrintWriter printWriter = new PrintWriter(fileWriter)){
			printWriter.println("Player Unknowns Battle Ground");
			printWriter.println("Final Fantacy XIV");
			printWriter.println("World Of Warcraft");
			// 强制写出操作，无论缓存是否写满
			printWriter.flush();
			printWriter.println("Edit: Anonymous");
			System.out.println("创建完成");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
