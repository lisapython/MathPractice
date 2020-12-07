package com.lisa.LearnSingleton;

import java.util.concurrent.ExecutorService;

public class ThreadPoolSingleton {

	private ExecutorService executorService;
    private final int availableProcessor = Runtime.getRuntime().availableProcessors();
    private ThreadPoolSingleton() {
        if (executorService == null) {
            int coreNum = availableProcessor / 2;
            
            // �õ���ģʽ�����̳߳أ�����2�������̣߳�����߳�ΪCPU������2n+1������.
            int maxProcessor = (availableProcessor * 2 + 1) * 2 ;
 
            //executorService = new ThreadPoolExecutor(coreNum > 2 ? 2 : coreNum, maxProcessor,60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        }
    }
 
 
    private static ThreadPoolSingleton instance;
 
    public static ThreadPoolSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadPoolSingleton();
        }
        return instance;
    }
 
    int executeThreadNum = 1;
    public void executeTask(Runnable runnable) {
        executorService.execute(runnable);
        //Log.d("ThreadPoolSingleton ", String.format("�첽�߳�ִ����%d�Ρ�", executeThreadNum++));
    }

}
