package com.Logical1;

import java.util.Scanner;

public class Primesmall {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the value:- ");
		int n1 = sc.nextInt();

		System.out.println("enter the value:- ");
		int n2 = sc.nextInt();

		findmin(n1, n2);

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
//	
	static void findmin(int n1, int n2) {

		int min = n2;
		int max = 0;

		for (int i = n1; i <= n2; i++) {

			if (isprime(i)) {

				System.out.println(i + " ");

				if(max<i) {
				max = i;
				}

				if (min > i) {
					min = i;

				}
			}

		}
		System.out.println("starting prime number is "+n1+" and  ending number is "+n2+" in that smallest prime number is= "+ min);
		System.out.println();
		System.out.println("starting prime number is "+n1+" and  ending number is "+n2+" in that largest prime number is= "+ max);
	}
}
