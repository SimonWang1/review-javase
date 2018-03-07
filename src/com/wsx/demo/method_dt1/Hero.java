package com.wsx.demo.method_dt1;

public class Hero {
	public String heroName;
	public float HP;

	// 形参注入接口，实现多态
	public void kill(Mortal m) {
		System.out.println(heroName + " used skill 'R'");
		m.die();
	}
}
