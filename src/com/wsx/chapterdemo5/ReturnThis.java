package com.wsx.chapterdemo5;

public class ReturnThis {
	public int age;
	public ReturnThis grow() {
		age ++;
		//return this返回调用该方法的对象
		//使用this可以让代码简洁，但可以造成实际意义的模糊
		return this;
	}
	public static void main(String[] args) {
		ReturnThis rt = new ReturnThis();
		rt.grow().grow().grow();
		System.out.println("rt的age成员变量值是：" + rt.age);
	}
}
