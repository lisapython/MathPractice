package com.lisa;


import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class ArrayListPra {

	public static void main(String[] args) {
		List alist = new ArrayList();
		alist.add(new Integer(1));
		alist.add(new Integer(2));
		alist.add(new Integer(5));
		alist.add(new Integer(6));
		alist.add(new Integer(3));
		alist.add(new Integer(4));
		
		for(Object i:alist) {
			System.out.println(i);
		}
		
		
		System.out.println("----------Vector------------");
		Vector v = new Vector(3, 2);
		v.addElement(new Integer(4));
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(5));
		v.addElement(new Integer(6));
		for(Object j:v) {
			System.out.println(j);
		}
		
		System.out.println("\nElements in vector:");
		Enumeration vEnum = v.elements();
	      
	      while(vEnum.hasMoreElements())
	         System.out.print(vEnum.nextElement() + " ");
		 //棧
	     Stack s = new Stack();
	      
	      
	      Properties p = System.getProperties();
	      System.out.println(p);
	      
	      Hashtable t = new Hashtable();
	      HashMap m = new HashMap();
	      List l = new ArrayList();
	      HashSet<String> sites = new HashSet<String>();
	      
	      //hashcode 和 equals
	      String aa = "aa";
	      String bb = "aa";
	      StringBuffer cc = new StringBuffer("aa");
	      StringBuffer dd = new StringBuffer("aa");
	      System.out.println(aa.hashCode());
	      System.out.println(bb.hashCode());
	      System.out.println(cc.hashCode());
	      System.out.println(dd.hashCode());
	      System.out.println(aa.equals(bb));
	      System.out.println(cc.equals(dd));
	      System.out.println(new Integer(1).equals(new Integer(1)));
	      System.out.println(Math.round(1.5));
	      System.out.println(Math.round(1.3));
	      System.out.println(Math.round(1.6));
	      System.out.println(Math.round(-1.5));//-1
	      System.out.println(Math.round(-1.3));//-1
	      System.out.println(Math.round(-1.6));//-2
	      StringBuilder b = new StringBuilder("bb");
	      
		System.out.println(ArrayListPra.charAtReverse("12345"));
		
	}
	
	public static String charAtReverse (String s){
		   int length = s.length();
		   String reverse = "";
		   for (int i = 0; i < length; i++) {
		    reverse = s.charAt(i)+reverse;//字符串中获取单个字符的字符的放法
		   }
		   return reverse;
		  }

}
