package com.wsx.demo.jdbc;

public class Item implements Comparable<Item>{
	// 包含逻辑的ORM实体类
	public int id;
	public String name;
	public int price;
	
	// 效果方法
	public void effect() {
		System.out.println("使用物品以后，产生对应效果");
	}
	
	// 提供返回false方法
	public boolean disposable() {
		return false;
	}
	
	// 重写比较方法
	@Override
	public int compareTo(Item o) {
		return o.price - price;
	}

	// 重写toString方法方便打印结果集
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]\r\n";
	}
	
	public Item(String name) {
		this.name = name;
	}
	
	public Item() {
		
	}
}
