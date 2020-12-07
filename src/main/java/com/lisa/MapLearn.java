package com.lisa;

import java.util.HashMap;
import java.util.Map;

public class MapLearn {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");
		map.put("4", "d");
		int data[] = {1,2,3,4,5};
		map.put("5", data);
		
		for(Object key : map.keySet()){
		    String value = (String)map.get(key);
		    System.out.println(key+":"+value);
		}
	}

}
