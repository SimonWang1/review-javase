package com.wsx.singleton;

public enum Singleton5 {
	// Enum
	INSTANCE;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
