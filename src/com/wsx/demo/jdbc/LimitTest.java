package com.wsx.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LimitTest {
	// 分页查询测试
	public static void main(String[] args) {
		limit(1, 3);
	}
	
	private static void limit(int start, int count) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// try-with-resource自动关闭
		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/how2j?" + "charactorEncoding=UTF-8", "root", "123456");
				Statement statement = connection.createStatement();) {
			String sql = "select * from hero limit " + start + "," + count;
			
			// Statement关闭时自动关闭ResultSet
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				// 使用字段名
				int id = resultSet.getInt("id");
				// 使用字段顺序
				String name = resultSet.getString(2);
				float hp = resultSet.getFloat("hp");
				int damage = resultSet.getInt("damage");
				System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, damage);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
