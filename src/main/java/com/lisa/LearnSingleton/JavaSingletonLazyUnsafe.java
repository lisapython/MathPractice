package com.lisa.LearnSingleton;

/**
 * 单例模式：懒汉模式因为
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
