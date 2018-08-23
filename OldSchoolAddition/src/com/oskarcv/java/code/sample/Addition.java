package com.oskarcv.java.code.sample;

public class Addition {

	public static void main(String[] args) {
		int []numA = {4,9,9};
		int []numB = {4,5,9};
		
		int []answ = new int[3];
		
		int carrier=0;
		for(int i= 2;i>=0;i--) {
			answ[i]= carrier + (numA[i]+numB[i])%10;
			carrier= (numA[i]+numB[i])/10;
		}
		for(int i= 0; i<3;i++) {
			System.out.print(+answ[i]);
		}

	}

}
