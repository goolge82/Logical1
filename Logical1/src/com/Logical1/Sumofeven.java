package com.Logical1;

import java.util.Scanner;

public class Sumofeven {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:- ");
		int n=sc.nextInt();
		
		System.out.print(n+" ");
		
		findsum(n);
		
		sc.close();
	}
	
	static void findsum(int n) {
		
		int sum=0;
//		int r=0;
		int count=1;
		while(n>0)	{
			
			int r=n%10;
			
			if(count%2==0) {
				
				sum=sum+r;
			}
			
			n=n/10;
			count++;
//			System.out.println();
//			System.out.println(count+" ");
		}
		
//		System.out.println(n+" ");
		
		System.out.println(sum);
	}

}
