package com.Logical1;

import java.util.Scanner;

public class Perfect1 {

	public static void main(String[] args) {

//		finding Nth perfect number

//		Perfect1 p=new Perfect1();
		
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the value:- ");
		int n = sc.nextInt();

//		boolean flag = isperfect(n);
//		if (flag) {
//			System.out.println("it is perfect");
//		} else {
//			System.out.println("it is not perfect");
//		}
		
		findN(n);

		sc.close();
	}

	static boolean isperfect(int n) {

		boolean flag = false;

		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}

		if (sum == n) {
			flag = true;
		}

		return flag;
	}
	
	static void findN(int n) {
		
		int count=0;
		
		
		for(int i=1; count<n; i++) {
		if(isperfect(i)) {
			
			System.out.println();
			count++;
		}
		
		if(count==n) {
			System.out.println(i);
		}
		}
		
	}

}
