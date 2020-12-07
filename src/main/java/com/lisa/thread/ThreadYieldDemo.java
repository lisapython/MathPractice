package com.lisa.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Yield�������ԣ�
 * 1.û��synchronized/û������ʱ��
 * 	yield�������߳��໥����
 *  ִ�н����A����=>B����=>A����=>B����=> / A����=>A����=>B����=>B����=>
 * 2.��synchronized/������ʱ��
 * 	����A�߳�ִ�����ִ��B�̣߳�B�߳���;�����Բ���
 * 	ִ�н����A����=>A����=>B����=>B����=>
 * 
 * �ܽ᣺yield�����ǲ��ͷ����ģ����A�߳��õ�����Դ��ͬʱ�������Ļ���
 * 	         ��ô��A�߳�yield��ʱ���ڣ�B��û�취�õ���Դ�ġ�
 * ��sleep�������ǣ�������״̬�£�sleep����Ǹ��߳��������ռcpu�ģ�yield����������ȼ����ֵġ�
 */
public class ThreadYieldDemo {

    private static Object lock = new Object();

    public static void main(String[] args) {
    	
    	 new Thread(()->{
    		 //synchronized (lock){
             synchronized (lock){
            	 System.out.print("A����=>");	
                 try {
                     Thread.yield();
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
                 System.out.print("A����=>");
           //}
             }

         }).start();
    	 
    	 Lock lock = new ReentrantLock();
    	 
    	new Thread(()->{
    		//synchronized (lock){
            synchronized (lock){
                System.out.print("B����=>");	
                try {
                	Thread.yield();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.print("B����=>");
            //}
           }
        }).start();
    }
}
