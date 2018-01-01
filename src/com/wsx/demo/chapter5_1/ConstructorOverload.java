package com.wsx.demo.chapter5_1;

public class ConstructorOverload {
	public static void main(String[] args) {
		//通过无参构造器创建对象
		ConstructorOverload co1 = new ConstructorOverload();
		ConstructorOverload co2 = new ConstructorOverload("网络是怎样连接的", 233);
		System.out.println(co1.name + "  " + co1.count);
		System.out.println(co2.name + "  " + co2.count);
	}
	public String name;
	public int count;
	public ConstructorOverload() {
	}
	//提供两个带参构造器，进行对象初始化
	public ConstructorOverload(String name, int count) {
		this.name = name;
		this.count = count;
	}
}
