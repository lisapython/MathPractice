package com.lisa.Lambda;

import java.util.function.Consumer;

public interface InterfaceLambda {
	void testMethod();
	//����ӿ�
}

class Demo{
	public static void main(String[] args) {
		//InterfaceLambda t = () -> System.out.println("����һ��Lambda���ʽ");
		//t.testMethod();
		Consumer<String> con = x -> System.out.println("С���ֵ�"+x+"��");
		con.accept("100��");
	}
	
}
