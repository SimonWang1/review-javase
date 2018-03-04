package com.wsx.demo.chapter6;

// Product接口
interface Product {
	public int getProduceTime();
}

public class Printer implements InterfaceStandard, Product {
	// 接口多实现
	private String[] printData = new String[MAX_CACHE_LINE];
	// 记录当前打印的作业数
	private int dataNum = 0;

	public static void main(String[] args) {
		// 创建一个InterfaceStandard对象，当成Output使用
		InterfaceStandard printer = new Printer();
		printer.getData("Java编程思想");
		printer.getData("疯狂Java讲义");
		printer.out();
		printer.getData("算法导论");
		printer.getData("算法图解");
		printer.out();
		// 调用InterfaceStandard接口中定义的默认方法
		printer.print("Robin", "Jack", "Pony");
		printer.test();
		// 创建Printer对象，当成Product使用
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		// 所有接口类型的引用变量都可以直接赋给Object类型的变量
		Object obj = p;
		// 打印地址消除未引用提示
		System.out.println(obj);
	}

	@Override
	public int getProduceTime() {
		return 45;
	}

	@Override
	public void out() {
		// 只要还有作业，就继续打印
		while (dataNum > 0) {
			System.out.println("打印机打印: " + printData[0]);
			// 把作业队列整体前移一位，并将剩下的作业数减1
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}

	@Override
	public void getData(String msg) {
		if (dataNum >= MAX_CACHE_LINE) {
			System.out.println("输出队列已满，添加失败");
		} else {
			// 把打印数据添加到队列里，以保存数据的数量加1
			printData[dataNum++] = msg;
		}
	}
}
