package com.wsx.demo.exception;

public class UserDefinedExceptionTest {
	// 自定义异常测试
	public static void main(String[] args) {
		Hero gareen = new Hero();
		gareen.name = "gareen";
		gareen.hp = 666;
		Hero teemo = new Hero();
		teemo.name = "teemo";
		teemo.hp = 0;
		try {
			gareen.attackHero(teemo);
		} catch (UserDefinedException e) {
			System.out.println("异常具体原因：" + e.getMessage());
			e.printStackTrace();
		}
	}
}
