package com.Logical1;

import java.util.Scanner;

public class Fibonacci1 {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value:- ");
		int n=sc.nextInt();
		
		findfibonacci(n);
		sc.close();
	}
	
	static void findfibonacci(int n) {
		
		int a=0;
		int b=1;
		int c=0;
		
//		System.out.println(a);
//		System.out.println(b);
		
		for(int i=1; i<=n-2; i++) {
			
		 c=a+b;
//		 System.out.println(c);
		 a=b;
		 b=c;
			
		}
		
		System.out.println(c);
	}

}
