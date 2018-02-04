package com.wsx.demo.sort_speed;

public interface Sort {
	// 排序接口，抽象出实现类的排序和取出结果的方法
	public void sort();

	public int[] values();
}
