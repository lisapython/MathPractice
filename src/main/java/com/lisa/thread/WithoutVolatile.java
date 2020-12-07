package com.lisa.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * ����һ���������ṩ��������add��size��д�����̣߳�
 * �߳�һ�����10��Ԫ�ص�������
 * �̶߳���ʵ�ּ��Ԫ�ظ�������������5����ʱ���߳�2������ʾ������
 * @author lisadmin
 *
 */
public class WithoutVolatile {
	// �ṩһ������
	List list = new ArrayList();

	// ����һ��add����
	public void add(Object o) {
		list.add(o);
	}

	// ����һ��size����
	public int size() {
		return list.size();
	}

	public static void main(String[] args) {
		WithoutVolatile wVolatile = new WithoutVolatile();
		
		// ����һ���߳�A,���Object��������
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				wVolatile.add(i);
				System.out.println("add " + i);
			}
		}, "t1").start();
		
		// �½�һ���߳�B,���ڼ�������ĸ���
		new Thread(() -> {
			while (true) {
				if (wVolatile.size() == 5) {
					break;
				}
			}
			System.out.println("�߳�t2 ����");
		}, "t2").start();
		
	}
}
