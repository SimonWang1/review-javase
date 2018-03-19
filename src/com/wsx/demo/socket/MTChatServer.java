package com.wsx.demo.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MTChatServer {
	// 多线程聊天服务端
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ServerSocket serverSocket = new ServerSocket(8888);
			
			System.out.println("监听端口号：8888");
			Socket socket = serverSocket.accept();
			
			// 启动发送消息线程
			new MTSendThread(socket).start();
			
			// 启动接收消息线程
			new MTRecieveThread(socket).start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
