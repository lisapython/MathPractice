package com.lisa.LearnSingleton;

/**
 * ����ģʽ������ģʽ��Ϊ
 * @author lisadmin
 *
 */
public class JavaSingletonLazyUnsafe {

	private JavaSingletonLazyUnsafe() {}
	
	private static JavaSingletonLazyUnsafe instance;
	
	
	public static JavaSingletonLazyUnsafe getInstance(){ 
		if(instance == null ) {
			instance = new JavaSingletonLazyUnsafe();
		}
		return instance;
	}
}
