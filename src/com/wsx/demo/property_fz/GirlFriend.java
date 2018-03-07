package com.wsx.demo.property_fz;

public class GirlFriend {
	// 测试类
	public static void main(String[] args) {
		// 声明引用类型是Friend，jth表示引用，在栈内存中存储堆内存地址
		// "=" 表示指向，使用new关键字调用重载构造器在堆内存创建对象并赋值
		Friend jth = new Friend("加藤惠", '女', 19, 52, 165, "C", "黑长直");
		System.out.println("new个对象出来");
		// 使用对象引用调用get方法在控制台格式化打印输出
		System.out.format("Name: " + jth.getName() + "%nAge: " + jth.getAge() + "%nSex: " + jth.getSex() + "%nSize:"
				+ jth.getSize() + "%nWeight: " + jth.getWeight() + "%nHeight: " + jth.getHeight() + "%nProperty: "
				+ jth.getProperty() + "%n");
		System.out.println("*********************************************");
		Friend xyjy = new Friend("新垣结衣", '♀', 1988, 49, 169, "D", "我老婆");
		System.out.format("Name: " + xyjy.getName() + "%nAge: " + xyjy.getAge() + "%nSex:" + xyjy.getSex() + "%nSize: "
				+ xyjy.getSize() + "%nWeight: " + xyjy.getWeight() + "%nHeight: " + xyjy.getHeight() + "%nProperty: "
				+ xyjy.getProperty() + "%n");
	}
}
