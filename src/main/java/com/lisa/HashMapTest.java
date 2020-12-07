package com.lisa;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap();
		
		for(int i=0;i<100;i++) {
			map.put(i+"", ""+i+"");
		}
		
		for(String key:map.values()) {
			System.out.println(key);
		}
		
		//Integer a = new Integer(2);
		//String a = "b";
		//System.out.println(a.hashCode());
		
		/*long currentTimeMills = System.currentTimeMillis();

		int a = 0;
		int times  = 10000*10000;
		for (long i = 0; i < times; i++) {
			 a=9999%1024;
		}

		long currentTimeMills2 = System.currentTimeMillis();
		
		int b=0;
		for (long i = 0; i < times; i++) {
			 b=9999&(1024-1);
		}
		
		long currentTimeMills3 = System.currentTimeMillis();
		
		System.out.println(a+","+b);
		System.out.println("%: "+(currentTimeMills2-currentTimeMills));
		System.out.println("&: "+(currentTimeMills3-currentTimeMills2));*/
		
		
		
	}

	public static int hash(Object key) {
        int h;
        int a = key.hashCode();
        System.out.println(a);
        
        int b = a >>> 16;
        System.out.println(b);
        
        int c = a ^ b;
        System.out.println(c);
        
        return 1;
    }
}
