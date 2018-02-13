package com.wsx.demo.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
	// BufferedWriter写出数据
	public static void main(String[] args) {
		// 创建文件绝对路径和文件名
		File file = new File("D:/StreamFolder/HotGame.txt");
		// 创建文件字符流
		try(FileWriter fileWriter = new FileWriter(file);
			// 缓冲流，减少IO写出次数
			PrintWriter printWriter = new PrintWriter(fileWriter)){
			printWriter.println("Player Unknowns Batter Ground");
			printWriter.println("Final Fantacy XIV");
			printWriter.println("World Of Warcraft");
			// 主动写出操作
			printWriter.flush();
			printWriter.println("Edit: Anonymous");
			System.out.println("创建完成");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
