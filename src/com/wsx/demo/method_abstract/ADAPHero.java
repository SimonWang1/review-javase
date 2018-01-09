package com.wsx.demo.method_abstract;

//单继承多实现
public class ADAPHero extends Hero implements AD, AP{
	@Override
	public void attack() {
		System.out.println(this.name + " used physic and magic attack");
	}
	
	@Override
	public void physicAttack() {
		System.out.println(this.name + " used Physic Attrack");
	}
	
	@Override
	public void magicAttack() {
		System.out.println(this.name + " used Magic Attrack");
	}
}
