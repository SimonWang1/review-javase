package com.wsx.demo.chapter4;

public class BreakTest2 {
	public static void main(String[] args) {
		outer: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i��ֵ��" + i + " j��ֵ��" + j);
				if (i == 2) {
					// �ж�ѭ��
					break outer;
				}
			}
		}
	}
}