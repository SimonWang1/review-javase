package com.wsx.demo.method_dt1;

public class Hero {
	public String heroName;
	public float HP;

	public static void main(String[] args) {
		// 使用父类声明引用类型只能访问父类定义的方法
		Hero gareen = new ADHero();
		gareen.heroName = "gareen";
		// 使用子类声明引用类型可以访问子类的所有方法
		ADHero ashe = new ADHero();
		ashe.heroName = "Ashe";
		APHero teemo = new APHero();
		teemo.heroName = "Teemo";
		ADAPHero caitlyn = new ADAPHero();
		caitlyn.heroName = "Caitlyn";
		gareen.kill(ashe);
		gareen.kill(teemo);
		gareen.kill(caitlyn);
	}

	// 形参注入接口，实现多态
	public void kill(Mortal m) {
		System.out.println(heroName + " used skill 'R'");
		m.die();
	}
}
