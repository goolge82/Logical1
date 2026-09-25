package com.Logical1;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {

		// prime range

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the value:- ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (isprime(i)) {
				System.out.print(i + " ");
			}
		}

		sc.close();
	}

	static boolean isprime(int n) {

		boolean flage = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flage = false;
				break;
			}
		}

		return flage;
	}

}

//main method
//n=10
//i=1-->1<=10--true
//if(isprime(i))--->it went to isprime method
//it check first if-condition 
//if n==0,1 it will return false it will come out of method 
//output:- nothing
//i is incremented at main method

//main method
//n=5
//i=2-->2<=5--true
//if(isprime(2))--->it went to isprime method
//it check first if-condition 
//if n==0,1 it will return false it will come out of method
//here 2 is not equal it won't enter to if-condition
//it went to for loop condition
//i=2-->2<2--false
//it come out from loop and it return flage in method flage true 
//output:- 2
//i is incremented at main method

//main method
//n=5
//i=3-->3<=5--true
//if(isprime(3))--->it went to isprime method
//it check first if-condition 
//if n==0,1 it will return false it will come out of method
//here 3 is not equal it won't enter to if-condition
//it went to for loop condition
//i=2-->2<3--true
//so it went to if-condtion--->n%i==0-->3%2==0-->1==0-->false
//again loop is still there i is increment 3
//i=3 3<3 false
//it come out from loop and it return flage in method flage true 
//output:- 2 3
//i is incremented at main method

//main method
//n=5
//i=4-->4<=5--true
//if(isprime(4))--->it went to isprime method
//it check first if-condition 
//if n==0,1 it will return false it will come out of method
//here 4 is not equal it won't enter to if-condition
//it went to for loop condition
//i=2-->2<4--true
//so it went to if-condtion--->n%i==0-->4%2==0-->0==0-->true
//so here it will return false and here it self it will break
//and it won't go again in loop and it won't print anything
//output:-2 3
//i is incremented at main method

//main method
//n=5
//i=5-->5<=5--true
//if(isprime(5))--->it went to isprime method
//it check first if-condition 
//if n==0,1 it will return false it will come out of method
//here 5 is not equal it won't enter to if-condition
//it went to for loop condition
//i=2-->2<5--true
//so it went to if-condtion--->n%i==0-->5%2==0-->1==0-->false
//again loop is still there i is increment 3
//i=3 3<5 true-->so it went to if-condtion--->n%i==0-->5%3==0-->2==0-->false
//again loop is still there i is increment 4
//i=4 4<5 true-->so it went to if-condtion--->n%i==0-->5%4==0-->1==0-->false
//again loop is still there i is increment 5
//i=5 5<5 false -->here it won't go if condition
//it come out from loop and it return flage in method flage true 
//output:- 2 3 5
//i is incremented at main method
