package com.Logical1;

import java.util.Scanner;

public class Sumn {

	public static void main(String[] args) {

//		sum of n
		Sumn s=new Sumn();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value:- ");
		int n=sc.nextInt();
		
		s.findsum(n);
		
		sc.close();
		
	}
	
	void findsum(int n) {
		
		int sum=0;
		
		for(int i=1; i<=n; i++) {
			
			sum+=i;
			
			System.out.print(sum+" ");
			
		}
		
//		n=5
		
//		sum=0
//		i=1--1<=5-->true
//		0+=1=1
//		output:-1
		
//		sum=1
//		i=2--2<=5-->true
//		1+=2=3
//		output:-1 3
		
//		sum=3
//		i=3--3<=5-->true
//		3+=3=6
//		output:-1 3 6
		
//		sum=6
//		i=4--4<=5-->true
//		6+=4=10
//		output:-1 3 6 10
		
//		sum=10
//		i=5--5<=5-->true
//		10+=5=15
//		output:-1 3 6 10 15
		
	}

}
