package com.lisa;

public class ReverseRecursive {

	//ตÝน้
	public static void main(String[] args) {
		ReverseRecursive r = new ReverseRecursive();
		System.out.println(r.reverseRecursive("1234567890"));
	}
	
	public String reverseRecursive(String s) {
		System.out.println(s);
		int length = s.length();
		if(length<=1) {
			return s;
		}
		String right = s.substring(length/2, length);
		System.out.println(right);//90 0
		
		String left = s.substring(0,length/2);
		System.out.println(left);//8   9
		
		
		String afterReverse = reverseRecursive(right)+reverseRecursive(left);
		System.out.println(right);
		System.out.println(left);
		System.out.println(afterReverse);
		return afterReverse;
	}

}
