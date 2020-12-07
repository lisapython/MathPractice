package com.lisa.LearnSingleton;

/**
 * 静态内部类单例模式
 * @author lisadmin
 *
 */
public class JavaSingletonStaticClass {
	
	private JavaSingletonStaticClass() {}
	
	private static JavaSingletonStaticClass getInstance() {
		return SingletonHolder.instance;
	}
	
	//静态的内部类
	private static class SingletonHolder{
		private static final JavaSingletonStaticClass instance = new JavaSingletonStaticClass();
	}
	
}
