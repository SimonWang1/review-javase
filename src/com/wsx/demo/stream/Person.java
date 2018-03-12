package com.wsx.demo.stream;

import java.io.Serializable;

public class Person implements Serializable{
	// 当前实体类版本，实体类发生变化时需修改版本号
	private static final long serialVersionUID = 1L;
	public String name;
	public float height;
}
