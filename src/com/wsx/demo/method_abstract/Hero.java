package com.wsx.demo.method_abstract;

public abstract class Hero {
	// 使用抽象类实现多态
	public String name;
	public float HP;

	// 提供抽象方法交给子类重写方法内容
	public abstract void attack();
}
