package com.wsx.demo.chapter4;

public class ReferenceArrayTest {
	// 引用存储堆内存地址
	public static void main(String[] args){
		// 创建数组类型对象
		Person[] students = new Person[2];
		Person zhang = new Person();
		zhang.age = 17;
		zhang.height = 177;
		Person lee = new Person();
		lee.age = 19;
		lee.height = 173;
		// 将两个引用存储到数组
		students[0] = zhang;
		students[1] = lee;
		zhang.info();
		//	数组引用students[1]和对象引用lee在栈内存存储相同的堆内存地址，显示相同数据
		lee.info();
		students[1].info();
	}
}
