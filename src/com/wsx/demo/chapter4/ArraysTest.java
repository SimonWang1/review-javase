package com.wsx.demo.chapter4;

import java.util.Arrays;

public class ArraysTest {
	// Arrays常用API
	public static void main(String[] args) {
		// 创建一个数组
		int[] a = { 3, 4, 5, 6 };
		int[] a2 = { 3, 4, 5, 6 };
		// static equals(Array1, Array2): 判断元素是否相等
		System.out.println("a数组和a2数组是否相等：" + Arrays.equals(a, a2));
		// static copyOf(Array, length): 复制数组a生成新数组b
		int[] b = Arrays.copyOf(a, 6);
		System.out.println("a数组和b数组是否相等：" + Arrays.equals(a, b));
		// static toString(Array): 输出数组b的元素
		System.out.println("b数组的元素为：" + Arrays.toString(b));
		// static fill(Array, start, end, element): 将b数组的第[2,4)赋值为1
		Arrays.fill(b, 2, 4, 1);
		System.out.println("b数组的元素为：" + Arrays.toString(b));
		// static sort(Array): 排序
		Arrays.sort(b);
		System.out.println("b数组的元素为：" + Arrays.toString(b));
	}
}
