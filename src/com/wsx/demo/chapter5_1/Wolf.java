package com.wsx.demo.chapter5_1;

class Creature {
	// 间接父类
	public Creature() {
		System.out.println("Creature non constructor");
	}
}

class Animal extends Creature {
	// 父类
	public Animal(String name) {
		System.out.println("Animal's one constructor, this name: " + name);
	}

	public Animal(String name, int age) {
		// 调用带参构造器，返回相同属性
		this(name);
		System.out.println("Animal's two constructor, age: " + age);
	}
}

public class Wolf extends Animal {
	// 子类继承调用
	public static void main(String[] args) {
		// 创建子类对象时默认从上到下依次调用所有父类与间接父类的构造器
		new Wolf();
	}

	public Wolf() {
		// 在子类构造器中显式调用父类两参构造器
		super("Taro Grey", 3);
		System.out.println("Wolf non constructor");
	}
}