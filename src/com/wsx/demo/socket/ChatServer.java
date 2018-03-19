package com.wsx.demo.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	// 聊天服务端
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8888);
			
			System.out.println("监听端口号：8888");
			Socket socket = serverSocket.accept();
			
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			
			while(true) {
				String message = dataInputStream.readUTF();
				System.out.println("客户端说：" + message);
				System.out.print("服务端：");
				Scanner scanner = new Scanner(System.in);
				String line = scanner.next();
				dataOutputStream.writeUTF(line);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
