package com.wsx.demo.chapter5;

public class ReturnThis {
	// return this返回调用该方法的对象
	// 声明全局变量age，自动赋值
	public int age;

	public static void main(String[] args) {
		ReturnThis rt = new ReturnThis();
		// 三次调用自增
		rt.grow().grow().grow();
		System.out.println("rt的age成员变量值是：" + rt.age);
	}

	public ReturnThis grow() {
		age++;
		// 使用this可以让代码简洁，但可能造成实际意义的模糊
		return this;
	}
}
