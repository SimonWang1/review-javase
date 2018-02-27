package com.wsx.demo.chapter5;

class DataWrap {
	int a;
	int b;
}

public class ReferenceTransferTest {
	// 全局变量交换变量值方法
	public static void main(String[] args) {
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 3;
		swap(dw);
		System.out.println("交换结束后，a成员变量的值是" + dw.a + "; b成员变量的值是" + dw.b);
	}

	public static void swap(DataWrap dw) {
		// 值交换
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		// 全局变量在交换时已完成内容转换
		System.out.println("swap方法里，a成员变量的值是" + dw.a + "; b成员变量的值是" + dw.b);
	}
}
