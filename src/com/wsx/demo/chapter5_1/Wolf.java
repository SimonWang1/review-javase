package com.wsx.demo.chapter5_1;

class Creature{
	public Creature() {
		System.out.println("Creature non constructor");
	}
}

class Animal extends Creature{
	public Animal(String name) {
		System.out.println("Animal's one constructor, this name: " + name);
	}
	
	public Animal(String name, int age) {
		//通过this调用同一个重载构造器，返回相同属性
		this(name);
		System.out.println("Animal's two constructor, age: " + age);
	}
}

public class Wolf extends Animal{
	public static void main(String[] args) {
		//通过无参构造器创建子类实例，同时调用父类与间接父类的所有构造器
		new Wolf();
	}
	
	public Wolf() {
		//通过super显式调用两参构造器
		super("Taro Grey", 3);
		System.out.println("Wolf non constructor");
	}
}