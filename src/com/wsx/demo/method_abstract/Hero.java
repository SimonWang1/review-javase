package com.wsx.demo.method_abstract;

public abstract class Hero {
	// 使用抽象类实现多态
	public String name;
	public float HP;

	// 提供抽象方法交给子类重写方法内容
	public abstract void attack();

	public static void main(String[] args) {
		// 使用子类声明引用并赋值
		ADHero ashe = new ADHero();
		ashe.name = "Ashe";
		APHero teemo = new APHero();
		teemo.name = "Teemo";
		ADAPHero caitlyn = new ADAPHero();
		caitlyn.name = "Caitlyn";
		System.out.printf("AD hero name: " + ashe.name + "%nAP hero name: " + teemo.name + "%nADAP hero name: "
				+ caitlyn.name + "%n");
		// 多态，调用相同方法，实现不同的效果
		ashe.attack();
		teemo.attack();
		caitlyn.physicAttack();
		caitlyn.magicAttack();
		caitlyn.attack();
	}
}
