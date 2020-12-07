package com.lisa.LearnSingleton;

/**
 * ��̬�ڲ��൥��ģʽ
 * @author lisadmin
 *
 */
public class JavaSingletonStaticClass {
	
	private JavaSingletonStaticClass() {}
	
	private static JavaSingletonStaticClass getInstance() {
		return SingletonHolder.instance;
	}
	
	//��̬���ڲ���
	private static class SingletonHolder{
		private static final JavaSingletonStaticClass instance = new JavaSingletonStaticClass();
	}
	
}
