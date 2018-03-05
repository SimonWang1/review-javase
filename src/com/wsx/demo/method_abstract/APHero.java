package com.wsx.demo.method_abstract;

public class APHero extends Hero implements AP{
	// Ä§·¨Ó¢ÐÛ
	@Override
	public void attack() {
		magicAttack();
	}
	
	@Override
	public void magicAttack() {
		System.out.println(this.name + " used magic attack");
	}
}
