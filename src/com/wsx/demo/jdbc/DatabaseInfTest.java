package com.wsx.demo.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseInfTest {
	// 数据库信息测试
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/how2j?" + "charactorEncoding=UTF-8", "root", "123456");){
			DatabaseMetaData data = connection.getMetaData();
			System.out.println("数据库产品名称：" + data.getDatabaseProductName());
			System.out.println("数据库版本号：" + data.getDatabaseProductVersion());
			System.out.println("数据库和表分隔符" + data.getCatalogSeparator());
			System.out.println("驱动版本：" + data.getDriverVersion());
			System.out.println("可用的数据库列表：");
			// 获取数据库名称
			ResultSet resultSet = data.getCatalogs();
			while(resultSet.next()) {
				System.out.println("数据库名称：" + resultSet.getString(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
