package com.wsx.demo.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class MTRecieveThread extends Thread{
	// 多线程聊天接收线程
	private Socket socket;
	
	public void run() {
		try {
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			
			while(true) {
				String message = dataInputStream.readUTF();
				System.out.println(message);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public MTRecieveThread(Socket socket) {
		this.socket = socket;
	}
}
