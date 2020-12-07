package com.lisa;

public class EqualsTest {

	public static void main(String[] args) {
		int a = 200;
		int b = 200;
		System.out.println("=====基本数据类型");
		System.out.println(a==b);//true
		//System.out.println(a.equals(b));基本数据类型是不可以用equals对比的
		
		
		Integer i = 1;
		Integer j = 1;
		//true  ,在-128~127之间是true
		//以外是false
		System.out.println("=====基本数据类型Integer的包装类 127以下");
		System.out.println(i==j);//true
		System.out.println("=====基本数据类型Integer的包装类 127以上");
		//127以上
		i=200;
		j=200;
		System.out.println(i==j);//false
		System.out.println(i.equals(j));//true
		
		Integer g = new Integer(200);
		Integer h = new Integer(200);
		System.out.println("=====new 基本数据类型的包装类");
		System.out.println(g==h);//false
		System.out.println(g.equals(h));//true
		
		System.out.println("=====new和非new 基本数据类型的包装类");
		System.out.println(i==g);//false
		
		System.out.println("=====基本数据类型和基本数据类型的包装类");
		System.out.println("=====非new 基本数据类型的包装类");
		System.out.println(a==i);//true
		System.out.println("=====new 基本数据类型的包装类");
		System.out.println(a==g);//true
		
		Double d1 = 1.01d;
		Double d2 = 1.01d;
		System.out.println("=====基本数据类型double的包装类");
		System.out.println(d1==d2);//false
		System.out.println(d1.equals(d2));//true
		
		String c = "abbccdde";
		String d = "abbccdde";
		System.out.println("=====String");
		System.out.println(c==d);//true
		System.out.println(c.equals(d));//true
		
		
		String e = new String("abbccdde");
		String f = new String("abbccdde");
		System.out.println("====new的String");
		System.out.println(e==f);//false
		System.out.println(e.equals(f));//true
		
		String s1 = "String1";
		String s2 = new String(s1);
		System.out.println("====String和new String的比较");
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
		EqualsObject aa = new EqualsObject();
		aa.setId(1);
		aa.setUserName("aa");
		
		EqualsObject bb = new EqualsObject();
		bb.setId(1);
		bb.setUserName("aa");
		
		System.out.println("====对象类型比较");
		System.out.println(aa==bb);//false
		System.out.println(aa.equals(bb));//false
		

	}
}
