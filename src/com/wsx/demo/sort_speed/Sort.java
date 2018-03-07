package com.wsx.demo.sort_speed;

public interface Sort {
	// 排序接口，抽象出排序和返回数组结果集的方法
	public void sort();

	public int[] values();
}
