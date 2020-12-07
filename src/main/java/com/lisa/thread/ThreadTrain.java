package com.lisa.thread;

public class ThreadTrain implements Runnable {

	// �ܹ���100�Ż�Ʊ
    private int trainCount = 100;
    
	@Override
	public void run() {
        while (trainCount > 0){
            try {
                // ����50��
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // ���ۻ�Ʊ
            sale();
        }
	}
	
    // ��Ʊ����
    public synchronized void sale(){
    	System.out.println(Thread.currentThread().getName()+",���۵�"+(100-trainCount+1)+"��Ʊ");
        trainCount--;
    }

}
