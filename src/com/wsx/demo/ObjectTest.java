package com.wsx.demo;

public class ObjectTest extends Object {
	public String name;
	public int price;

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		ObjectTest ot1 = new ObjectTest("Java编程思想", 86);
		System.out.println(ot1.toString());
		System.out.println(ot1.equals(100));
		ot1.finalize();
	}

	public ObjectTest(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public ObjectTest() {

	}

	// 重写Object类toString方法
	public String toString() {
		return "花费 ￥" + this.price + " 购买" + this.name;
	}

	// 重写Object类finalize方法
	public void finalize() {
		// 空返回值类型隐藏return null
		System.out.println("如果基础不扎实，买了" + this.name + "也是从入门到放弃...");
	}

	// 重写Object类equals方法
	public boolean equals(Object o) {
		// 判断输入参数类型是否属于本类
		if (o instanceof ObjectTest) {
			// 如果属于便转换成本类
			ObjectTest ot = (ObjectTest) o;
			// 相同返回true
			if (ot.price == this.price) {
				return true;
			}
			// 不同返回false
			else {
				return false;
			}
		}
		// 不属于返回false
		return false;
	}
}
