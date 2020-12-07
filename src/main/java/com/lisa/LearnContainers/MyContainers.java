package com.lisa.LearnContainers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyContainers {
    public static void main(String[] args) {

        String[] a1 = {"1", "2", "3", "4"};
        String[] a2 = new String[4];
        String[] a3 = new String[]{"", "", "", ""};

        //数组
        int[] nums = {15, 4, 3, 2};
        Arrays.sort(nums);
        for (int i : nums){
            System.out.print(i + " ");
        }

        Class clazz = null;
        Object array=null;
        try {
            clazz = Class.forName("java.lang.String");
            array = Array.newInstance(clazz,3);
            Array.set(array, 2, "Hello");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        List list = new ArrayList<>();
        list.add(1);
    }
}
