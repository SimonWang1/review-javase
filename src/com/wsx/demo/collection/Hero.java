package com.wsx.demo.collection;

public class Hero {
	// 实体类
	public String name;
	public float hp;
	public int damage;
	// 重写toString方法
	public String toString() {
		return this.name;
	}
	
	// 增加初始化name的构造方法
	public Hero(String name) {
		this.name = name;
	}
	
	public Hero() {
		
	}
}
