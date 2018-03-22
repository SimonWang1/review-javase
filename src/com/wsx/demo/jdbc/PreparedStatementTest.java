package com.wsx.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementTest {
	// PreparedStatement测试
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 使用PreparedStatement传入的sql语句可读性更强，性能更好，可以防止注入攻击
		String sql = "insert into hero values(null, ?, ?, ?)";
		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/how2j?" + "charactorEncoding=UTF-8", "root", "123456");
				// 根据sql语句创建PreparedStatement
				PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
			
			// 设置参数
			preparedStatement.setString(1, "teemo");
			preparedStatement.setFloat(2, 313.0f);
			preparedStatement.setInt(3, 50);
			// 执行
			preparedStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
