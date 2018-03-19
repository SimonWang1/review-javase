package com.wsx.demo.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClient {
	// 聊天客户端
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 8888);
			
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			
			while(true) {
				System.out.print("客户端：");
				Scanner scanner = new Scanner(System.in);
				String line = scanner.next();
				dataOutputStream.writeUTF(line);
				String message = dataInputStream.readUTF();
				System.out.println("服务器说：" + message);
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
