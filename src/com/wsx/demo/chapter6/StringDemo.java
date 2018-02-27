package com.wsx.demo.chapter6;

import java.util.Scanner;

public class StringDemo {
	// String格式化
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入地名：");
		String location = sc.nextLine();
		System.out.println("请输入公司类型：");
		String companyType = sc.nextLine();
		System.out.println("请输入公司名称：");
		String companyName = sc.nextLine();
		System.out.println("请输入老板姓名：");
		String bossName = sc.nextLine();
		System.out.println("请输入金额：");
		String money = sc.nextLine();
		System.out.println("请输入产品名称：");
		String product = sc.nextLine();
		System.out.println("请输入单位：");
		String unit = sc.nextLine();
		System.out.println(location + "最大" + companyType + companyName + "倒闭了，王八蛋老板"
				+ bossName + "吃喝嫖赌，欠下" + money + "个亿，带着他的小姨子跑了！");
		System.out.println("我们没有办法，拿着" + product + "抵工资！原价一" + unit + "多，两" +
				unit + "多的" + product + "，现在全部只要二十块！");
		System.out.println(bossName + "王八蛋，你不是人！我们辛辛苦苦给你干了大半年，你不发工资，你还我"
				+ "血汗钱！还我血汗钱！");
	}
}
