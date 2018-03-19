package com.wsx.demo.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalHostTest {
	// 本地IP测试
	public static void main(String[] args) throws UnknownHostException {
		InetAddress host = InetAddress.getLocalHost();
		String ip = host.getHostAddress();
		System.out.println("本机ip地址：" + ip);
	}
}
