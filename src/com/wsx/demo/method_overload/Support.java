package com.wsx.demo.method_overload;

public class Support extends Hero{
	// 方法重载，方法名相同，参数个数不同
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "盖伦";
		Hero syndra = new Hero();
		syndra.name = "辛德拉";
		Support soraka = new Support();
		soraka.name = "索拉卡";
		soraka.heal();
		soraka.heal(syndra);
		soraka.heal(syndra, garen);
	}
	
	public void heal() {
		System.out.println(name + "使用了回血技能");
	}
	
	public void heal(Hero h1) {
		System.out.println(name + "恢复了" + h1.name + "的血量");
	}
	
	public void heal(Hero h1, Hero h2) {
		System.out.println(name + "恢复了" + h1.name + "和" + h2.name + "的血量");
	}
}
