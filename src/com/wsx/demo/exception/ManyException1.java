package com.wsx.demo.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ManyException1 {
	// 多异常捕捉1
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		File f = new File("d:\\stream.txt");
		try {
			System.out.println("试图打开d:\\stream.txt");
			new FileInputStream(f);
			System.out.println("成功打开");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			Date d = sdf.parse("2018-02-08");
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在");
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("日期格式解析错误");
			e.printStackTrace();
		}
	}
}