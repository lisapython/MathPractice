package com.lisa.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * ����һ���������ṩ��������add��size��д�����̣߳�
 * �߳�һ�����10��Ԫ�ص�������
 * �̶߳���ʵ�ּ��Ԫ�ظ�������������5����ʱ���߳�2������ʾ������
 * @author lisadmin
 *
 */
public class WaitNotify {
	// �ṩһ������
	volatile List list = new LinkedList<>();
	
	// ����һ��add����
	public void add(Object o) {
		list.add(o);
	}

	// ����һ��size����
	public int size() {
		return list.size();
	}

	public static void main(String[] args) {
		WaitNotify t = new WaitNotify();
		
		final Object lock = new Object();
		
		// �Ȱѹ۲����߳�����
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
		
		// t1֮������
		new Thread(() -> {
			System.out.println("t1 start ");
			synchronized(lock) {
				for (int i = 0; i < 10; i++) {
					t.add(i);
					System.out.println("add " + i);
					if(t.size() == 5) {
						//���ͷ���
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
