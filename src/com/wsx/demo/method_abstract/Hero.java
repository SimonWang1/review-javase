package com.wsx.demo.method_abstract;

public abstract class Hero {
	public String name;
	public float HP;
	//�ṩ���󷽷�����������д��������
	public abstract void attack();
	public static void main(String[] args) {
		//�ֱ�ʵ��������ֵ
		ADHero ashe = new ADHero();
		ashe.name = "Ashe";
		APHero teemo = new APHero();
		teemo.name = "Teemo";
		ADAPHero caitlyn = new ADAPHero();
		caitlyn.name = "Caitlyn";
		System.out.printf("AD hero name: " + ashe.name + "%nAP hero name: " + teemo.name
				+ "%nADAP hero name: " + caitlyn.name + "%n");
		//��̬��������ͬ���������ֲ�ͬ��̬
		ashe.attack();
		teemo.attack();
		caitlyn.physicAttack();
		caitlyn.magicAttack();
		caitlyn.attack();
	}
}