package com.wsx.demo.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionPoolTest {
	// 自定义连接池测试
	public static void main(String[] args) {
		// 连接池初始化3条连接
		ConnectionPool connectionPool = new ConnectionPool(3);
		// 初始化100条线程向连接池请求连接
		for(int i = 0; i < 100; i++) {
			new WorkingThread("working thread " + i, connectionPool).start();
		}
	}
}

class WorkingThread extends Thread{
	// 请求连接线程类
	private ConnectionPool connectionPool;
	
	public void run() {
		Connection connection = connectionPool.getConnection();
		System.out.println(this.getName() + "：获取了一根连接，并开始工作");
		try(Statement statement = connection.createStatement();){
			// 模拟耗时1秒的SQL语句
			Thread.sleep(1000);
			statement.executeQuery("select * from hero");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		connectionPool.returnConnection(connection);
	}
	
	public WorkingThread(String name, ConnectionPool connectionPool) {
		super(name);
		this.connectionPool = connectionPool;
	}
}
