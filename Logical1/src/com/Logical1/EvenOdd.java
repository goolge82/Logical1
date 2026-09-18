package com.Logical1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		
		EvenOdd e=new EvenOdd();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value:- ");
		int n=sc.nextInt();
		
		e.evenodd(n);
		
		sc.close();
	}
	
	void evenodd(int n) {
		
		
		System.out.println();
		
		System.out.println("Even numbers:- ");
		for(int i=0; i<=n; i=i+1) {
			if(i%2==0 && i!=0) {
//				i=1--->it is initialization and starting number---->first step
//				i<=n-->it is condition and where it need to end---->second step
				System.out.print(i+" "); //-----> third step
				
//				i=i+1/i++/i=i-1/i----->increment/decrement-----> fourth step
			}
		}
		
		
		System.out.println();
		System.out.println("Odd numbers:- ");
		for(int i=0; i<=n; i=i+1) {
			if(i%2==1 && i!=0) {
//				i=1--->it is initialization and starting number---->first step
//				i<=n-->it is condition and where it need to end---->second step
				System.out.print(i+" "); //-----> third step
				
//				i=i+1/i++/i=i-1/i----->increment/decrement-----> fourth step
			}
		}
	}

}
