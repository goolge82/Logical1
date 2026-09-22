package com.Logical1;

import java.util.Scanner;

public class Fibonaccis2 {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value:- ");
		int n=sc.nextInt();
		
		
//		findfibonaccis(n, 0, 1);
		System.out.println(findfibonaccis(n));
		
		sc.close();
	}
	
	static int findfibonaccis(int n) {
		
		
		if(n==0) {
			return 0;
			
		}
		if(n==1) {
			return 1;
		}
		
//		System.out.println(a);
		return findfibonaccis(n-1)+findfibonaccis(n-2);
		
	}

}
