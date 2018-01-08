package com.wsx.demo.method_dt;

public class ADAPHero extends Hero implements Mortal{
	
	public void die() {
		System.out.println("ADAPHero " + this.heroName + " has been killed");
	}
}
