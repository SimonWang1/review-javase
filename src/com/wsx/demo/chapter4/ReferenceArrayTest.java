package com.wsx.demo.chapter4;

public class ReferenceArrayTest {
	public static void main(String[] args){
		Person[] students;
		students = new Person[2];
		Person zhang = new Person();
		zhang.age = 17;
		zhang.height = 177;
		Person lee = new Person();
		lee.age = 19;
		lee.height = 173;
		students[0] = zhang;
		students[1] = lee;
		zhang.info();
//		数组引用类型指向相同的堆内存地址，所以显示相同数据
		lee.info();
		students[1].info();
	}
}
