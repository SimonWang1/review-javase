package com.wsx.demo.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	// 队列：队头读取队尾插，先进先出，基于双向链表，不能随机访问队列元素，在队头队尾进行操作
	public static void main(String[] args) {
		// LinkedList基于双向链表，实现了双端队列接口Deque，Deque继承队列接口Queue，进而实现了Queue接口
		Queue<Hero> q = new LinkedList<>();
		// offer(Object): 在队列末尾添加元素
		System.out.format("初始化队列: %n");
		q.offer(new Hero("hero1"));
		q.offer(new Hero("hero2"));
		q.offer(new Hero("hero3"));
		q.offer(new Hero("hero4"));
		// 双向链表前后存储下一个元素的地址
		System.out.println(q);
		// poll(): 取出队列首元素，先进先出
		System.out.format("取出队列首元素: %n");
		Hero h = q.poll();
		System.out.println(h);
		System.out.format("取出首元素后的队列: %n");
		System.out.println(q);
		// peek(): 查看队列首元素
		System.out.format("查看队列首元素: %n");
		System.out.println(q.peek());
		System.out.format("peek操作不会影响队列内容: %n");
		System.out.println(q);
	}
}
