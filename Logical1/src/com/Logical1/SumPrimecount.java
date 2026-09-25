package com.Logical1;

import java.util.Scanner;

public class SumPrimecount {
	
//	sum of prime numbers

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the value:- ");
		int n = sc.nextInt();
		
		int count=0;
		
		for(int i=1; i<=n; i++) {
			if(isprime(i)) {
				count++;
			}
		}

		findsum(n);
		
		System.out.println("count of prime is:- "+ count);

		sc.close();
	}

	static boolean isprime(int n) {

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static void findsum(int n) {

		int sum = 0;

		for (int i = 1; i <= n; i++) {

			if (isprime(i)) {
				System.out.print(i+" ");
				sum += i;

			}

		}

		System.out.println();
		System.out.println("sum of prime numbers are :- "+sum);
		
		if(isprime(sum)) {
			System.out.println(sum+"  it is a prime");
		}
		else {
			System.out.println(sum+" it is not a prime");
		}
	}

}
