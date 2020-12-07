package com.lisa.thread;

public class DeadLockTest {

	public static String obj1 = "obj1";
    public static String obj2 = "obj2";
    public static void main(String[] args){
        Thread a = new Thread(new DeadLockA());
        Thread b = new Thread(new DeadLockB());
        a.start();
        b.start();
    }  

}

class DeadLockA implements Runnable{

	@Override
	public void run() {
		try{
            System.out.println("Lock1 running");
            while(true){
                synchronized(DeadLockTest.obj1){
                    System.out.println("Lock1 lock obj1");
                    Thread.sleep(3000);//获取obj1后先等一会儿，让Lock2有足够的时间锁住obj2
                    synchronized(DeadLockTest.obj2){
                        System.out.println("Lock1 lock obj2");
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
	}
	
}

class DeadLockB implements Runnable{

	@Override
	public void run() {
		try{
            System.out.println("Lock2 running");
            while(true){
                synchronized(DeadLockTest.obj2){
                    System.out.println("Lock2 lock obj2");
                    Thread.sleep(3000);
                    synchronized(DeadLockTest.obj1){
                        System.out.println("Lock2 lock obj1");
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
		
	}
	
}