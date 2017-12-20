package com.wsx.chapterdemo5_1;

public class Person {
	//使用private修饰，封成员变量
	private String name;
	private int age;
	//提供方法操作name成员变量
	public void setName(String name) {
		//用户名在2~6之间校验
		if(name.length() > 6 || name.length() < 2) {
			System.out.println("输入的人名不符合要求");
			return;
		}
		else {
			this.name = name;
		}
	}
	
	public String getName() {
		return this.name;
	}
	//提供方法操作age成员变量
	public void setAge(int age) {
		//用户年龄在0~100之间校验
		if(age > 100 || age < 0) {
			System.out.println("输入的年龄不合法");
			return;
		}
		else {
			this.age = age;
		}
	}
	public int getAge() {
		return this.age;
	}
}
