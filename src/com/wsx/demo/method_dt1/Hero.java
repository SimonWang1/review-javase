package com.wsx.demo.method_dt1;

public class Hero {
	// 父类
	public String heroName;
	public float HP;

	// 形参注入接口，实现多态
	public void kill(Mortal m) {
		System.out.println(heroName + " used skill 'R'");
		// 调用kill方法的同时调用参数对象重写Mortal接口的die方法
		m.die();
	}
}
