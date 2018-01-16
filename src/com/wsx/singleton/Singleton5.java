package com.wsx.singleton;

// Enum
public enum Singleton5 {
	INSTANCE;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
