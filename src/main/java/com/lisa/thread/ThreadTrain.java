package com.lisa.thread;

public class ThreadTrain implements Runnable {

	// 总共有100张火车票
    private int trainCount = 100;
    
	@Override
	public void run() {
        while (trainCount > 0){
            try {
                // 休眠50秒
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 出售火车票
            sale();
        }
	}
	
    // 卖票方法
    public synchronized void sale(){
    	System.out.println(Thread.currentThread().getName()+",出售第"+(100-trainCount+1)+"张票");
        trainCount--;
    }

}
