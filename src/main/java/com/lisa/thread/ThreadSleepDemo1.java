package com.lisa.thread;

/**
 * sleep方法测试：
 * 1.没有synchronized/没有锁的时候
 * 	两条线程相互竞争，A休眠B马上开始执行，B休眠A马上开始执行
 * 	执行结果：A休眠=>B休眠=>B醒来=>A醒来=>/A休眠=>B休眠=>A醒来=>B醒来=>两种答案相互出现
 * 2.有synchronized/有锁的时候
 * 	必须A线程执行完才可以执行B线程，B线程中途不可以插手
 * 	执行结果：A休眠=>A醒来=>B休眠=>B醒来=>
 * 
 * 总结：sleep方法是不释放锁的，如果A线程拿到了资源，同时上了锁的话，
 * 	         那么在A线程sleep的时间内，B是没办法拿到资源的。
 */
public class ThreadSleepDemo1 {

    private static Object lock = new Object();

    public static void main(String[] args) {
    	
    	 new Thread(()->{
    		 //synchronized (lock){
             synchronized (lock){
            	 System.out.print("A休眠=>");	
                 try {
                     Thread.sleep(100);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 System.out.print("A醒来=>");
           //}
             }

         }).start();
    	
    	new Thread(()->{
    		//synchronized (lock){
            synchronized (lock){
                System.out.print("B休眠=>");	
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("B醒来=>");
            //}
           }
        }).start();
    }
}
