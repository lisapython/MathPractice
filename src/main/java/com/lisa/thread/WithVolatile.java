package com.lisa.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 给定一个容器，提供两个方法add，size，写两个线程：
 * 线程一：添加10个元素到容器中
 * 线程二：实现监控元素个数，当个数到5个的时候，线程2给出提示并结束
 * @author lisadmin
 *
 */
public class WithVolatile {
	// 提供一个容器
	//volatile List list = new LinkedList();
	
	//同步容器
	volatile List list = Collections.synchronizedList(new LinkedList<>());

	// 这是一个add方法
	public void add(Object o) {
		list.add(o);
	}

	// 这是一个size方法
	public int size() {
		return list.size();
	}

	public static void main(String[] args) {
		WithVolatile t = new WithVolatile();
		
		// 这是一个线程A,添加Object到容器中
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				t.add(i);
				System.out.println("add " + i);
				
				/*try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			}
		}, "t1").start();
		
		// 新建一个线程B,用于监控容器的个数
		new Thread(() -> {
			while (true) {
				if (t.size() == 5) {
					break;
				}
			}
			System.out.println("线程t2 结束");
		}, "t2").start();
		
	}
}
