package com.wsx.demo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {
	// Supplier方法调用
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		// Supplier接口方法中内置了抽象方法
		Supplier<List> s = new Supplier<List>() {
			@Override
			public List get() {
				// TODO Auto-generated method stub
				return new ArrayList<>();
			}
		};
		// 匿名类实现
		List list1 = getList(s);
		// Lambda表达式
		List list2 = getList(() -> new ArrayList<>());
		// 引用构造器
		List list3 = getList(ArrayList :: new);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<Hero> getList(Supplier<List> s){
		return s.get();
	}
}
