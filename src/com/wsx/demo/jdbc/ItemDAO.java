package com.wsx.demo.jdbc;

import java.util.List;

public interface ItemDAO {
	// 实体类接口
	// 添加
	public void add(Item item);
	// 修改
	public void update(Item item);
	// 删除
	public void delete(int id);
	// 获取单条
	public Item get(int id);
	// 查询所有
	public List<Item> list();
	// 分页查询
	public List<Item> list(int start, int count);
}
