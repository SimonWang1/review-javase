package com.wsx.demo.chapter5_1;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		//age成员变量被隐藏，下面语句出现错误
//		p.age = 1000;
		//下面语句运行提示错误且不会赋值
		p.setAge(1000);
		//输出0
		System.out.println("未能赋值age成员变量时：" + p.getAge());
		//成功修改
		p.setAge(24);
		//输出24
		System.out.println("成功赋值age成员变量后：" + p.getAge());
		//赋值成员变量name并打印
		p.setName("Wangsx");
		System.out.println("成功赋值name成员变量后：" + p.getName());
	}
}
