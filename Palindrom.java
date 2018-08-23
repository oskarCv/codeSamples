package com.oskarcv.java.exersices;

public class Palindrom {
	
	public static boolean isPalindrom(String name) {
		int rIndex = name.length()-1;
		boolean isPalindrom=true;
		for (int i=0;i<name.length()/2;i++) {
			if(name.charAt(i)==name.charAt(rIndex)){
				rIndex--;
				continue;
			}else {
				isPalindrom=false;
				break;
			}
		}
		return isPalindrom;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrom(""));
	}

}
