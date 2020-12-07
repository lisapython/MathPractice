package com.lisa;

public class ToBinary {

	public static void main(String[] args) {
		String str = "A";
	    char[] strChar=str.toCharArray();
	    String result="";
	    for(int i=0;i<strChar.length;i++){
	        result +=Integer.toBinaryString(strChar[i])+ "";
	    }
	    System.out.println(result);
	    
	    
	    System.out.println(Integer.toBinaryString(13));//
	    
	    System.out.println("----------------------------");
	    System.out.println(Integer.toBinaryString(1));//
	    System.out.println(Integer.toBinaryString(2));//10
	    System.out.println(Integer.toBinaryString(4));//100
	    System.out.println(Integer.toBinaryString(8));//1000
	    System.out.println(Integer.toBinaryString(16));//10000
	    System.out.println(Integer.toBinaryString(32));
	    System.out.println(Integer.toBinaryString(64));
	    System.out.println(Integer.toBinaryString(128));
	    System.out.println(Integer.toBinaryString(256));
	    
	    System.out.println("----------------------------");
	    System.out.println(Integer.toBinaryString(1));
	    System.out.println(Integer.toBinaryString(3));
	    System.out.println(Integer.toBinaryString(7));
	    System.out.println(Integer.toBinaryString(15));
	    System.out.println(Integer.toBinaryString(31));
	    System.out.println(Integer.toBinaryString(63));
	    System.out.println(Integer.toBinaryString(127));
	    System.out.println(Integer.toBinaryString(255));
	    
	    System.out.println("----------------------------");
	    System.out.println(1 << 30);
	    System.out.println(1 << 29);
	    System.out.println(Integer.MAX_VALUE);
	    
	}

}
