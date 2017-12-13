package com.wsx.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws IOException, InterruptedException {
		@SuppressWarnings("resource")
		ServerSocket server = new ServerSocket(9999);
		Socket client = server.accept();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String sk = null;
		do {
			do {
				byte bb[] = new byte[client.getInputStream().available()];
				client.getInputStream().read(bb);
				sk = new String(bb);
			} while (sk.equals(""));
			System.out.println("客户端说：" + sk);
			System.out.println("请输入与客户端聊天内容");
			String se = sc.next();
			client.getOutputStream().write(se.getBytes());
		} while (true);
	}
}
