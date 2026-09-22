package com.Logical1;

import java.util.Scanner;

public class Factorial1 {

	
//	finding nth factorial
	
	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value:- ");
		int n=sc.nextInt();
		
		findfactor(n);
		
		sc.close();
	}
	
	static void findfactor(int n) {
        int fact=1;
		
		for(int i=1; i<=n; i++) {
			fact*=i;
		}
		
		System.out.println(fact);
	}

}
