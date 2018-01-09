package com.wsx.demo.property_fz;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Friend implements Serializable{
	private String name;
	private char sex;
	private int age;
	private double weight;
	private int height;
	private String size;
	private String property;
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public Friend(String name, char sex, int age, double weight, int height, String size, String property) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.size = size;
		this.property = property;
	}

	public Friend() {
		super();
	}
}
