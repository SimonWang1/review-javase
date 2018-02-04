package com.wsx.demo.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueTest {
	// LinkedList实现了List接口，可以使用List声明引用类型，调用List方法
	public static void main(String[] args) {
		List<Hero> ll = new LinkedList<>();
		ll.add(new Hero("hero1"));
		// LinkedList基于双向链表，实现了Deque双向队列，进而实现了Queue接口，
		// 队列先进先出，不能随机访问队列中的元素
		Queue<Hero> q = new LinkedList<>();
		// offer(Object): 在队列末尾添加元素
		System.out.format("初始化队列: %n");
		q.offer(new Hero("hero1"));
		q.offer(new Hero("hero2"));
		q.offer(new Hero("hero3"));
		q.offer(new Hero("hero4"));
		// 双向链表前后存储对应下一个元素的地址，无需遍历元素索引即可查询
		System.out.println(q);
		System.out.format("取出队列首元素: %n");
		// poll(): 取出队列首元素，先进先出
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
