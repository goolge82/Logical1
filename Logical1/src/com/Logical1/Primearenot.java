package com.Logical1;

import java.util.Scanner;

//prime means divided by one are itself

public class Primearenot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value:- ");
		int n = sc.nextInt();

		boolean flage = isprime(n);

		if (flage) {
			System.out.println(n + " it is prime number");
		} else {
			System.out.println(n + " it is not prime number");
		}

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

}
