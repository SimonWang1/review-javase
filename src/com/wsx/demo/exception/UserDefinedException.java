package com.wsx.demo.exception;

@SuppressWarnings("serial")
public class UserDefinedException extends Exception{
	// 自定义异常
	public UserDefinedException(String msg) {
		super(msg);
	}
	
	public UserDefinedException() {
		
	}
}
