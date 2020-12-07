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
public class WaitNotify {
	// 提供一个容器
	volatile List list = new LinkedList<>();
	
	// 这是一个add方法
	public void add(Object o) {
		list.add(o);
	}

	// 这是一个size方法
	public int size() {
		return list.size();
	}

	public static void main(String[] args) {
		WaitNotify t = new WaitNotify();
		
		final Object lock = new Object();
		
		// 先把观察者线程起来
		new Thread(() -> {
			synchronized(lock) {
				System.out.println("t2 start ");
				if (t.size() != 5) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("t2 end ");
			}
		}, "t1").start();
		
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// t1之后启动
		new Thread(() -> {
			System.out.println("t1 start ");
			synchronized(lock) {
				for (int i = 0; i < 10; i++) {
					t.add(i);
					System.out.println("add " + i);
					if(t.size() == 5) {
						//不释放锁
						lock.notify();
					}
					
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			System.out.println("t1 end ");
		}, "t1").start();
		
	}
}
