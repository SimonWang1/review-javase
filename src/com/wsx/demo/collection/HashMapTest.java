package com.wsx.demo.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		// HashMap: 散列表键值对形式，键唯一，查询添加删除速度快，线程不安全
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("adc", "physical hero");
		dictionary.put("apc", "magic hero");
		dictionary.put("t", "tank");
		System.out.println(dictionary.get("t"));
		Map<String, Hero> heroMap = new HashMap<>();
		heroMap.put("gareen", new Hero("gareen1"));
		System.out.println(heroMap);
		// 存储键相同的数据，值会被覆盖
		heroMap.put("gareen", new Hero("gareen2"));
		System.out.println(heroMap);
		// clear(): 清空map
		heroMap.clear();
		Hero heroGareen = new Hero("gareen");
		// 只要键不同，可以存储相同值，存储无顺序
		heroMap.put("hero1", heroGareen);
		heroMap.put("hero2", heroGareen);
		System.out.println(heroMap);
	}
}
