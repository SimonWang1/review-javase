package com.wsx.demo;

public class SequenceTest {
	// 执行顺序
	static {
		SequenceTest.getName("静态代码化块");
	}

	public String name = SequenceTest.getName("属性声明");
	
	{
		SequenceTest.getName("普通初始化块");
	}

	public static void main(String[] args) {
		// 执行顺序依次为静态代码块，属性声明，普通初始化块，构造器
		new SequenceTest();
	}

	public SequenceTest() {
		SequenceTest.getName("构造器");
	}

	private static String getName(String pos) {
		String result = "name: " + pos;
		System.out.println(result);
		return result;
	}
}
