package com.wsx.demo.property_enum;

public class EnumTest {
	// TANK,WIZARD,ASSASSIN,ASSIST,WARRIOR,RANGED,PUSH,FARMING
	public static void main(String[] args) {
		// 使用枚举类定义常量，不会出现类未定义的属性
		HeroEnum type = HeroEnum.WIZARD;
		switch (type) {
		case TANK:
			System.out.println("TANK");
			break;
		case WIZARD:
			System.out.println("WIZARD");
			break;
		case ASSASSIN:
			System.out.println("ASSASSIN");
			break;
		case ASSIST:
			System.out.println("ASSIST");
			break;
		case WARRIOR:
			System.out.println("WARRIOR");
			break;
		case RANGED:
			System.out.println("RANGED");
			break;
		case PUSH:
			System.out.println("PUSH");
			break;
		case FARMING:
			System.out.println("FARMING");
			break;
		}
	}
}
