package com.wsx.chapterdemo5_1;

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
