package com.lisa.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Yield方法测试：
 * 1.没有synchronized/没有锁的时候
 * 	yield后两条线程相互竞争
 *  执行结果：A休眠=>B休眠=>A醒来=>B醒来=> / A休眠=>A醒来=>B休眠=>B醒来=>
 * 2.有synchronized/有锁的时候
 * 	必须A线程执行完才执行B线程，B线程中途不可以插手
 * 	执行结果：A休眠=>A醒来=>B休眠=>B醒来=>
 * 
 * 总结：yield方法是不释放锁的，如果A线程拿到了资源，同时上了锁的话，
 * 	         那么在A线程yield的时间内，B是没办法拿到资源的。
 * 和sleep的区别是，无锁的状态下，sleep完后是各线程是随机抢占cpu的，yield完后是有优先级区分的。
 */
public class ThreadYieldDemo {

    private static Object lock = new Object();

    public static void main(String[] args) {
    	
    	 new Thread(()->{
    		 //synchronized (lock){
             synchronized (lock){
            	 System.out.print("A休眠=>");	
                 try {
                     Thread.yield();
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
                 System.out.print("A醒来=>");
           //}
             }

         }).start();
    	 
    	 Lock lock = new ReentrantLock();
    	 
    	new Thread(()->{
    		//synchronized (lock){
            synchronized (lock){
                System.out.print("B休眠=>");	
                try {
                	Thread.yield();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.print("B醒来=>");
            //}
           }
        }).start();
    }
}
