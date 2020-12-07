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
public class WithVolatile {
	// �ṩһ������
	//volatile List list = new LinkedList();
	
	//ͬ������
	volatile List list = Collections.synchronizedList(new LinkedList<>());

	// ����һ��add����
	public void add(Object o) {
		list.add(o);
	}

	// ����һ��size����
	public int size() {
		return list.size();
	}

	public static void main(String[] args) {
		WithVolatile t = new WithVolatile();
		
		// ����һ���߳�A,���Object��������
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
		
		// �½�һ���߳�B,���ڼ�������ĸ���
		new Thread(() -> {
			while (true) {
				if (t.size() == 5) {
					break;
				}
			}
			System.out.println("�߳�t2 ����");
		}, "t2").start();
		
	}
}
