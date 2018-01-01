package com.wsx.demo.chapter5_1;

class Animal1{
	private void beat() {
		System.out.println("心脏跳动");
	}
	
	public void breath() {
		beat();
		System.out.println("吸气，吐气，呼吸...");
	}
}
//继承Animal，直接复用父类的breath()方法
class Bird1 extends Animal1{
	public void fly() {
		System.out.println("我在天空自由飞翔...");
	}
}
//继承Animal，直接复用父类的breath()方法
class Wolf1 extends Animal1{
	public void run() {
		System.out.println("我在陆地上快速奔跑...");
	}
}

public class InheritTest {
	public static void main(String[] args) {
		//使用继承组合让子类同时拥有父类的breath方法，实现代码复用的重要手段
		Bird1 b = new Bird1();
		b.breath();
		b.fly();
		Wolf1 w = new Wolf1();
		w.breath();
		w.run();
	}
}
