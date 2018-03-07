package com.wsx.demo.collection;

import java.util.LinkedList;

public class StackTest {
	// 通过LinkedList实现栈先进后出
	LinkedList<Hero> heros = new LinkedList<>();
	public static void main(String[] args) {
		StackTest heroStack = new StackTest();
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
	
	// 压栈
	public void push(Hero h) {
		// 队尾插入数据
		heros.addLast(h);
	}
	
	// 出栈
	public Hero pull() {
		// 移除队尾数据
		return heros.removeLast();
	}
	
	// 查看栈顶元素
	public Hero peek() {
		// 获取队尾数据
		return heros.getLast();
	}
}
