package com.lisa.Lambda;

import java.util.function.Consumer;

public interface InterfaceLambda {
	void testMethod();
	//特殊接口
}

class Demo{
	public static void main(String[] args) {
		//InterfaceLambda t = () -> System.out.println("这是一个Lambda表达式");
		//t.testMethod();
		Consumer<String> con = x -> System.out.println("小明又得"+x+"了");
		con.accept("100分");
	}
	
}
