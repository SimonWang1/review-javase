package com.wsx.demo.constructor_overload;

public class Hero {
	private String heroName;
	private float heroHP;
	private float heroArmer;
	private int heroMoveSpeed;
	
	public static void main(String[] args) {
		Hero gareen = new Hero("Gareen", 3000, 50, 200);
		System.out.printf("HeroName: " + gareen.getHeroName() + 
				"%nHeroHP: " + gareen.getHeroHP() + "%nHeroArmer: " + gareen.getHeroArmer() +
				"%nHeroMoveSpeed: " + gareen.getHeroMoveSpeed() + "%n");
	}
	
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
	
	public Hero(String heroName, float heroHP, float heroArmer, int heroMoveSpeed) {
		this.heroName = heroName;
		this.heroHP = heroHP;
		this.heroArmer = heroArmer;
		this.heroMoveSpeed = heroMoveSpeed;
	}

	public Hero() {

	}
}
