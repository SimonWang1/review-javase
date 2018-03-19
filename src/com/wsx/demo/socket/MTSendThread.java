package com.wsx.demo.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MTSendThread extends Thread{
	// 多线程聊天发送线程
	private Socket socket;
	
	public void run() {
		try {
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			
			while(true) {
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				String message = scanner.next();
				dataOutputStream.writeUTF(message);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public MTSendThread(Socket socket) {
		this.socket = socket;
	}
}
