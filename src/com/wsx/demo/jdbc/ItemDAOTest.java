package com.wsx.demo.jdbc;

import java.util.List;

public class ItemDAOTest {
	// 逻辑测试类
	public static void main(String[] args) {
		ItemDAOImp dao = new ItemDAOImp();
		List<Item> items = dao.list();
		System.out.println("数据库中共有" + items.size() + "条数据");
		Item item = new Item("新的物品");
		System.out.println("添加一条数据");
		dao.add(item);
		items = dao.list();
		System.out.println("数据库中共有" + items.size() + "条数据");
		System.out.println("取出id=9的数据，它的name是：");
		item = dao.get(9);
		System.out.println(item.name);
		System.out.println("把名字改为 物品x，并且更新到数据库");
		item.name = "物品x";
		dao.update(item);
		System.out.println("取出id=9的数据，它的name是：");
		item = dao.get(9);
		System.out.println(item.name);
		System.out.println("删除id=4的数据");
		dao.delete(9);
		items = dao.list();
		System.out.println("数据库中共有" + items.size() + "条数据");
	}
}
