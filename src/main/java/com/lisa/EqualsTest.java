package com.lisa;

public class EqualsTest {

	public static void main(String[] args) {
		int a = 200;
		int b = 200;
		System.out.println("=====������������");
		System.out.println(a==b);//true
		//System.out.println(a.equals(b));�������������ǲ�������equals�Աȵ�
		
		
		Integer i = 1;
		Integer j = 1;
		//true  ,��-128~127֮����true
		//������false
		System.out.println("=====������������Integer�İ�װ�� 127����");
		System.out.println(i==j);//true
		System.out.println("=====������������Integer�İ�װ�� 127����");
		//127����
		i=200;
		j=200;
		System.out.println(i==j);//false
		System.out.println(i.equals(j));//true
		
		Integer g = new Integer(200);
		Integer h = new Integer(200);
		System.out.println("=====new �����������͵İ�װ��");
		System.out.println(g==h);//false
		System.out.println(g.equals(h));//true
		
		System.out.println("=====new�ͷ�new �����������͵İ�װ��");
		System.out.println(i==g);//false
		
		System.out.println("=====�����������ͺͻ����������͵İ�װ��");
		System.out.println("=====��new �����������͵İ�װ��");
		System.out.println(a==i);//true
		System.out.println("=====new �����������͵İ�װ��");
		System.out.println(a==g);//true
		
		Double d1 = 1.01d;
		Double d2 = 1.01d;
		System.out.println("=====������������double�İ�װ��");
		System.out.println(d1==d2);//false
		System.out.println(d1.equals(d2));//true
		
		String c = "abbccdde";
		String d = "abbccdde";
		System.out.println("=====String");
		System.out.println(c==d);//true
		System.out.println(c.equals(d));//true
		
		
		String e = new String("abbccdde");
		String f = new String("abbccdde");
		System.out.println("====new��String");
		System.out.println(e==f);//false
		System.out.println(e.equals(f));//true
		
		String s1 = "String1";
		String s2 = new String(s1);
		System.out.println("====String��new String�ıȽ�");
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
		EqualsObject aa = new EqualsObject();
		aa.setId(1);
		aa.setUserName("aa");
		
		EqualsObject bb = new EqualsObject();
		bb.setId(1);
		bb.setUserName("aa");
		
		System.out.println("====�������ͱȽ�");
		System.out.println(aa==bb);//false
		System.out.println(aa.equals(bb));//false
		

	}
}
