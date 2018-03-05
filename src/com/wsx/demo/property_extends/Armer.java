package com.wsx.demo.property_extends;

public class Armer extends Item{
	// 继承实现代码复用
	public int ac;
	public static void main(String[] args) {
		// 子类可以直接调用父类声明的属性，多用于拓展接口
		Armer bj = new Armer();
		bj.name = "布甲";
		bj.price = 300;
		bj.ac = 15;
		Armer szj = new Armer();
		szj.name = "锁子甲";
		szj.price = 500;
		szj.ac = 40;
		System.out.println(bj.name + "  " + bj.price + "  " + bj.ac);
		System.out.println(szj.name + "  " + szj.price + "  " + szj.ac);
	}
}
