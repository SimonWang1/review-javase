package com.wsx.demo.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonStreamTest {
	// 实体类序列化
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Wangsx";
		person.height = 171;
		// 用于保存对象的文件
		File file = new File("D:/StreamFolder/person.txt");
		try (
				// 对象输出流
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
				// 对象输入流
				FileInputStream fileInputStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
			objectOutputStream.writeObject(person);
			Person person2 = (Person) objectInputStream.readObject();
			System.out.println(person2.name);
			System.out.println(person2.height);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
