package com.lisa.LearnContainers;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 用来debug，看ArrayList的源码。
 * @author lisadmin
 *
 */
public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        System.out.println(getListCapacity(list));
        for(int i=0;i<100;i++) {
            list.add(String.valueOf(i));
            //list.get(i);

            System.out.println("size = " + list.size() + ", capacity = " + getListCapacity(list));
        }
		System.out.println(list.size());
		list.remove(55);
	}
	
	public static int getListCapacity(List arrayList) {
		Class<ArrayList> arrayListClass = ArrayList.class;
		int capacity = 0;
		
		try {
			Field field = arrayListClass.getDeclaredField("elementData");
			field.setAccessible(true);
            Object[] objects = (Object[])field.get(arrayList);
            capacity = objects.length;
		} catch (Exception e) {
			e.printStackTrace();
            capacity = -1;
		}
		return capacity;
		
	}

}
