package com.wsx.chapterdemo4;

public class PirmitiveArrayTest {
	public static void main(String[] args) {
		// ¶¯Ì¬³õÊ¼»¯
		int[] iArr;
		iArr = new int[5];
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 10;
			System.out.println(iArr[i]);
		}
	}
}
