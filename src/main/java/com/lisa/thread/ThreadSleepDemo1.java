package com.lisa.thread;

/**
 * sleep�������ԣ�
 * 1.û��synchronized/û������ʱ��
 * 	�����߳��໥������A����B���Ͽ�ʼִ�У�B����A���Ͽ�ʼִ��
 * 	ִ�н����A����=>B����=>B����=>A����=>/A����=>B����=>A����=>B����=>���ִ��໥����
 * 2.��synchronized/������ʱ��
 * 	����A�߳�ִ����ſ���ִ��B�̣߳�B�߳���;�����Բ���
 * 	ִ�н����A����=>A����=>B����=>B����=>
 * 
 * �ܽ᣺sleep�����ǲ��ͷ����ģ����A�߳��õ�����Դ��ͬʱ�������Ļ���
 * 	         ��ô��A�߳�sleep��ʱ���ڣ�B��û�취�õ���Դ�ġ�
 */
public class ThreadSleepDemo1 {

    private static Object lock = new Object();

    public static void main(String[] args) {
    	
    	 new Thread(()->{
    		 //synchronized (lock){
             synchronized (lock){
            	 System.out.print("A����=>");	
                 try {
                     Thread.sleep(100);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 System.out.print("A����=>");
           //}
             }

         }).start();
    	
    	new Thread(()->{
    		//synchronized (lock){
            synchronized (lock){
                System.out.print("B����=>");	
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("B����=>");
            //}
           }
        }).start();
    }
}
