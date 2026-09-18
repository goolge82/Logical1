package com.Logical1;

import java.util.Scanner;

//Write a Java program to find the sum of all numbers from 1 to N that are divisible by both 3 and 5 using a for loop.

public class Divisior {

	public static void main(String[] args) {

		
		Divisior d=new Divisior();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value:- ");
		
		int n=sc.nextInt();
		
		d.divisior(n);
		
		sc.close();
	}
	
	void divisior(int n) {
		
		int sum=0;
		
		for(int i=1; i<=n; i=i+1) {
			
			if(i%3==0 && i%5==0) {
				sum=sum+i;
				System.out.println(i);
			}	
		}
		System.out.println(sum);
	}

}
