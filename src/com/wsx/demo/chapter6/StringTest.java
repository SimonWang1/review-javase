package com.wsx.demo.chapter6;

public class StringTest {
	public static void main(String[] args) {
		// StringBuffer拼接反转
		String aString = "0-12345";
		StringBuffer sBuffer = new StringBuffer(aString);
		sBuffer.append("6789");
		sBuffer.reverse();
		System.out.println(sBuffer);
		// 字符串反转
		String bString = "Have a nice day";
		char[] b = bString.toCharArray();
		System.out.println(b);
		for(int i = b.length - 1; i >= 0; i--) {
			System.out.print(b[i]);
		}
		System.out.format("%n----------------%n");
		// 切割字符串
		String[] bArray = bString.split(" ");
		for(String i : bArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(bArray.length);
		System.out.println(bArray[3]);
		// 调用方法
		stringRev("Hello world");
	}
	
	// 按字符串倒序输出
	private static void stringRev(String str) {
		String[] sArray = str.split(" ");
		for(int i = sArray.length - 1; i >= 0; i --) {
			System.out.print(sArray[i] + " ");
		}
	}
}
