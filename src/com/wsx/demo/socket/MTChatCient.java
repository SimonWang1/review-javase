package com.wsx.demo.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MTChatCient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 8888);
			
			// 启动发送消息线程
			new MTSendThread(socket).start();
			
			// 启动接收消息线程
			new MTRecieveThread(socket).start();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
