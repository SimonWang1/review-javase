package com.wsx.demo.property_fz;

public class Hero {
	// 实体类
	private String heroName;
	private float heroHP;
	private float heroArmer;
	private int heroMoveSpeed;

	public static void main(String[] args) {
		Hero gareen = new Hero("Gareen", 3000, 50, 200);
		System.out.printf("HeroName: " + gareen.getHeroName() + "%nHeroHP: " + gareen.getHeroHP() + "%nHeroArmer: "
				+ gareen.getHeroArmer() + "%nHeroMoveSpeed: " + gareen.getHeroMoveSpeed() + "%n");
	}

	// 属性set，get方法
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getHeroName() {
		return this.heroName;
	}

	public void setHeroHP(float heroHP) {
		this.heroHP = heroHP;
	}

	public float getHeroHP() {
		return this.heroHP;
	}

	public void setHeroArmer(float heroArmer) {
		this.heroArmer = heroArmer;
	}

	public float getHeroArmer() {
		return this.heroArmer;
	}

	public void setHeroMoveSpeed(int heroMoveSpeed) {
		this.heroMoveSpeed = heroMoveSpeed;
	}

	public int getHeroMoveSpeed() {
		return this.heroMoveSpeed;
	}

	// 重载构造器，方便传参
	public Hero(String heroName, float heroHP, float heroArmer, int heroMoveSpeed) {
		this.heroName = heroName;
		this.heroHP = heroHP;
		this.heroArmer = heroArmer;
		this.heroMoveSpeed = heroMoveSpeed;
	}

	public Hero() {

	}
}
