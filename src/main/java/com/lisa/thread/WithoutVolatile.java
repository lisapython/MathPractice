package com.lisa.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个容器，提供两个方法add，size，写两个线程：
 * 线程一：添加10个元素到容器中
 * 线程二：实现监控元素个数，当个数到5个的时候，线程2给出提示并结束
 * @author lisadmin
 *
 */
public class WithoutVolatile {
	// 提供一个容器
	List list = new ArrayList();

	// 这是一个add方法
	public void add(Object o) {
		list.add(o);
	}

	// 这是一个size方法
	public int size() {
		return list.size();
	}

	public static void main(String[] args) {
		WithoutVolatile wVolatile = new WithoutVolatile();
		
		// 这是一个线程A,添加Object到容器中
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				wVolatile.add(i);
				System.out.println("add " + i);
			}
		}, "t1").start();
		
		// 新建一个线程B,用于监控容器的个数
		new Thread(() -> {
			while (true) {
				if (wVolatile.size() == 5) {
					break;
				}
			}
			System.out.println("线程t2 结束");
		}, "t2").start();
		
	}
}
