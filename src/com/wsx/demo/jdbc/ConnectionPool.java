package com.wsx.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	// 自定义连接池
	// 初始化连接条数
	int size;
	// 声明连接池，将连接放入List容器
	List<Connection> connectionPool = new ArrayList<>();
	
	// 初始化连接
	public void init() {
		// 连接池中连接无需关闭
		try {
			Class.forName("com.mysql.jdbc.Driver");
			for(int i = 0; i < size; i++) {
				Connection connection = DriverManager.
						getConnection("jdbc:mysql://localhost/how2j?" + "charactorEncoding=UTF-8", "root", "123456");
				connectionPool.add(connection);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 获取连接
	public synchronized Connection getConnection() {
		// 若无可用线程，请求连接线程等待
		while(connectionPool.isEmpty()) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Connection connection = connectionPool.remove(0);
		return connection;
	}
	
	// 唤醒线程
	public synchronized void returnConnection(Connection connection) {
		connectionPool.add(connection);
		// 有可用线程时使用notifyAll()唤醒处于wait()状态的请求连接线程
		this.notifyAll();
	}
	
	public ConnectionPool(int size) {
		this.size = size;
		init();
	}
}
