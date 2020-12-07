package com.lisa.LearnContainers;

public class SystemArrayCopyTest {

    public static void main(String[] args) {
        //源数组
        String[] str1 = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        //要拷贝的目标数组
        String[] str2 = str1;

        int size = 10;
        int index = 5;
        int numMoved = size - index - 1;
        System.arraycopy(str1, 5, str2, 4, numMoved);
        for (String str:str2) {
            System.out.println(str);
        }

    }
}
