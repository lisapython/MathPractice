package com.lisa.LearnSingleton;

public class JavaSingletonLazySafe {
	private JavaSingletonLazySafe() {}
	
	private static JavaSingletonLazySafe instance;
	
	public static synchronized JavaSingletonLazySafe getInstance() {
		if(instance == null) {
			instance = new JavaSingletonLazySafe();
		}
		return instance;
	}
	
}
