package com.Logical1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Fibonacci f=new Fibonacci();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value:- ");
		int n=sc.nextInt();
		
		f.findfibonacci(n);
		
		sc.close();
	}
	
	void findfibonacci(int n) {
		
		int a=0; //current number
		int b=1; //next number
		
		
//		i=1--->it is initialization and starting number---->first step
//		i<=n-->it is condition and where it need to end---->second step
//		System.out.print(i+" "); //-----> third step
//		i=i+1/i++/i=i-1/i----->increment/decrement-----> fourth step
		
		for(int i=1; i<=n; i++) {
			
			
			System.out.print(a+" ");
			
			int c=a+b;
			a=b;
			b=c;
			
			
//			n=5
			
//			a=0 b=1

//			i=1--1<=5--true
//			output:- 0
			
//			calculation:-
//			c=0+1=1
//			a=0,b=1,c=1
//			a=b
//			b=c
//			a=1,b=1,c=1
			
			
//			a=1 b=1

//			i=2--2<=5--true
//			output:- 0 1
			
//			calculation:-
//			c=1+1=2
//			a=1,b=1,c=2
//			a=b
//			b=c
//			a=1,b=2,c=2
			
			
//			a=1 b=2

//			i=3--3<=5--true
//			output:- 0 1 1
			
//			calculation:-
//			c=1+2=3
//			a=1,b=2,c=3
//			a=b
//			b=c
//			a=2,b=3,c=3
			
			
//			a=2 b=3

//			i=4--4<=5--true
//			output:- 0 1 1 2
			
//			calculation:-
//			c=2+3=5
//			a=2,b=3,c=5
//			a=b
//			b=c
//			a=3,b=5,c=5
			
			
//			a=3 b=5

//			i=5--5<=5--true
//			output:- 0 1 1 2 3 
			
//			calculation:-
//			c=3+5=8
//			a=3,b=5,c=8
//			a=b
//			b=c
//			a=5,b=8,c=8
			
			
//		System.out.print(c+" ");
		}
		
	}

}
