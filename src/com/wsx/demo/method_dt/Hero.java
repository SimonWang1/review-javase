package com.wsx.demo.method_dt;

public class Hero {
	public String heroName;
	public float HP;
	public static void main(String[] args) {
		//在父类创建对象时引用类型可以和对象类型不同
		Hero gareen = new ADHero();
		gareen.heroName = "gareen";
		//创建子类对象时引用类型和对象类型要相同
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
	
	public void kill(Mortal m) {
		System.out.println(heroName + " used skill 'R'");
		m.die();
	}
}
