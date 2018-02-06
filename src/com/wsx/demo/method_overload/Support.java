package com.wsx.demo.method_overload;

public class Support extends Hero{
	// 方法重载，方法名相同，参数个数不同
	public static void main(String[] args) {
		Hero gl = new Hero();
		Hero sj = new Hero();
		Support slk = new Support();
		sj.name = "赏金";
		gl.name = "盖伦";
		slk.name = "索拉卡";
		slk.heal();
		slk.heal(sj);
		slk.heal(sj, gl);
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
