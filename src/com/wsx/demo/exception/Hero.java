package com.wsx.demo.exception;

public class Hero {
	// 测试实体类
	public String name;
	protected float hp;
	
	public void attackHero(Hero h) throws DefinedException{
		if(h.hp == 0) {
			throw new DefinedException(h.name + "英雄被击杀，不用释放技能");
		}
	}
	
	public String toString() {
		return this.name;
	}
}
