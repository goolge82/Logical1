package com.Logical1;

import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value:- ");
		int n=sc.nextInt();
		
		
		
//		findfactor(n);
		
		System.out.println(findfactor(n));
		sc.close();
		
	}
	
	static int findfactor(int n) {
		
		int fact=1;
		if(n==0||n==1) {
			return 1;
		}
		
		return n*(findfactor(n-1));
		
		
	}

}
