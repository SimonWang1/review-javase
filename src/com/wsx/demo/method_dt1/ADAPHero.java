package com.wsx.demo.method_dt1;

public class ADAPHero extends Hero implements Mortal{
	// »ìºÏÏµÓ¢ÐÛ
	public void die() {
		System.out.println("ADAPHero " + this.heroName + " has been killed");
	}
}
