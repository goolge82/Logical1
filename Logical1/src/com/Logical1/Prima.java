package com.Logical1;

import java.util.Scanner;

public class Prima {

	public static void main(String[] args) {
		
		
		//count prime
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value:- ");
		int n=sc.nextInt();
		
		
		int count=0;
		
		for(int i=1; count<n; i++) {
			if(isprime(i)) {
				count++;
			}
		
		if(count==n) {
			System.out.println(i);
			break;
		}
		}
		
		
		sc.close();
	
	}
	
	
	static boolean isprime(int n) {
		
		if(n==0||n==1) {
			return false;
		}
		
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}

}
