package com.wsx.demo.chapter5_1;

class Bird {
	// 父类
	public void fly() {
		System.out.println("I can fly in the sky...");
	}
}

public class Ostrish extends Bird{
	public static void main(String[] args) {
		Ostrish os = new Ostrish();
		//执行子类方法
		os.fly();
	}
	
	public void fly() {
		System.out.println("I can only run on the ground...");
	}
}
