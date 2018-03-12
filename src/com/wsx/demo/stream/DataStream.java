package com.wsx.demo.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStream {
	// DataStream数据流
	public static void main(String[] args) {
		write();
		read();
	}
	
	private static void write() {
		try(OutputStream outputStream = new FileOutputStream("D:/StreamFolder/data stream"); 
			DataOutputStream dataOutputStream = new DataOutputStream(outputStream);){
			dataOutputStream.writeInt(123);
			dataOutputStream.writeBoolean(true);
			dataOutputStream.writeUTF("Hello, guys! ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// DataInputSteam读取的文件必须是DataOutputSteam写出的，否则会报错
	private static void read() {
		try(InputStream inputStream = new FileInputStream("D:/StreamFolder/data stream");
			DataInputStream dataInputStream = new DataInputStream(inputStream);){
			System.out.println("读取整形值：" + dataInputStream.readInt());
			System.out.println("读取布尔值：" + dataInputStream.readBoolean());
			System.out.println("读取字符串：" + dataInputStream.readUTF());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
