package com.wsx.demo.chapter6;

public class OutputFiledTest {
	public static void main(String[] args){
		//若要访问另一个包中的Output接口的MAX_CACHE_LINE，需要加包名
		System.out.println(com.wsx.demo.chapter6.Output.MAX_CACHE_LINE);
		//下行引发"为final变量赋值"的编译异常
//		Output.MAX_CACHE_LINE = 20;
		//使用接口调用方法
		System.out.println(Output.staticTest());
	}
}
