package com.Logical1;

import java.util.Scanner;

public class Forloop3 {

	public static void main(String[] args) {

//		1.Write a Java program to print numbers from 1 to 20 using a for loop.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value:- ");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
//			i=1--->it is initialization and starting number---->first step
//			i<=n-->it is condition and where it need to end---->second step
			System.out.print(i+" "); //-----> third step
			
//			i=i+1/i++/i=i-1/i----->increment/decrement-----> fourth step
		}
		
		sc.close();
	}

}
