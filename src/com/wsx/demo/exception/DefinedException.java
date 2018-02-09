package com.wsx.demo.exception;

@SuppressWarnings("serial")
public class DefinedException extends Exception{
	// 自定义异常
	public DefinedException(String msg) {
		super(msg);
	}
	
	public DefinedException() {
		
	}
}
