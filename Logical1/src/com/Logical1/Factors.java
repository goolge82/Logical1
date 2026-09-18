package com.Logical1;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {

		
		Factors f=new Factors();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value:- ");
		
		int n=sc.nextInt();
		
		f.findfactor(n);
		
		sc.close();
		
	}
	
	
	
	void findfactor(int n) {
		
		for(int i=1; i<=n; i=i+1) {
			if(n%i==0) {
//				i=1--->it is initialization and starting number---->first step
//				i<=n-->it is condition and where it need to end---->second step
				System.out.print(i+" "); //-----> third step
				
//				i=i+1/i++/i=i-1/i----->increment/decrement-----> fourth step
			}
		}
//		System.out.println(n);
		
		
//		n=5
		
//		i=1--1<=5-->true
//		5%1==0
//		1)5(5
//		  5
//		----
//		  0
		
//		0==0-->true
		
//		output:- 1
		
//		i=2--2<=5-->true
//		5%2==0
//		2)5(2
//		  4
//		----
//		  1
//		1==0-->false
		
//		output:- 1
		
//		i=3--3<=5-->true
//		5%3==0
//		3)5(1
//		  3
//		----
//		  2
//		2==0-->false
		
//		output:- 1
		
//		i=4--4<=5-->true
//		5%4==0
//		4)5(1
//		  4
//		----
//		  1
//		1==0-->false
		
//		output:- 1
		
//		i=5--5<=5-->true
//		5%5==0
//		5)5(1
//		  5
//		----
//		  0
//		0==0-->true
		
//		output:- 1 5
		
		
	}
	

}
