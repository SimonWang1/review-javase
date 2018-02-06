package com.wsx.demo.collection;

import java.util.LinkedList;

public class HeroStack {
	// 泛型限制注入类型，通过LinkedList实现栈效果
	LinkedList<Hero> heros = new LinkedList<>();
	public static void main(String[] args) {
		HeroStack heroStack = new HeroStack();
		for(int i = 0; i < 5; i++) {
			Hero h = new Hero("Hero name " + i);
			System.out.println("压入Hero: " + h.name);
			heroStack.push(h);
		}
		Hero hs = heroStack.peek();
		System.out.println("查看栈顶Hero: " + hs.name);
		for(int i = 0; i < 5; i++) {
			Hero h = heroStack.pull();
			System.out.println("弹出Hero: " + h.name);
		}
	}
	
	public void push(Hero h) {
		heros.addLast(h);
	}
	
	public Hero pull() {
		return heros.removeLast();
	}
	
	public Hero peek() {
		return heros.getLast();
	}
}
