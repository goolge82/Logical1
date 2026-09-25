package com.Logical1;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value:- ");
		int n=sc.nextInt();
		
		
		findfactor(n);
		
		sc.close();
	}
	
	static boolean isprime(int n) {
		
		if(n==0||n==1) {
			return false;
		}
		
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
		
	}

	
	static void findfactor(int n) {
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				
				if(isprime(i)) {
					System.out.println(i+ " ");
				}
			}
		}
	}
	
//n=5
//it went to findfactor method
//	i=1-->1<=5-->true
//	so it went to if-condtion--->n%i==0-->5%1-->
//	1)5(1
//	  5
//	 ----
//	   0
//	0==0 so true
//	it went to if-condition-->isprime(i)-->it went to isprime
//	there it checks
//	n=1 so it went to  first if-condition n==0||n==1
//	n=1 so it will return false so it is not a prime 
//	so it comes to findfactor method 1 is not a prime so it won't print anything
//	output:- nothing
//	after coming out from method main method i will increment
	
//	-------------------------------------------------------------------------------------
	
//n=5
//it went to findfactor method
//		i=-->2<=5-->true
//		so it went to if-condtion--->n%i==0-->5%1-->
//		2)5(2
//		  4
//		 ----
//		   1
//		1==0 so false
//		it went to if-condition-->isprime(i)-->it went to isprime
//		there it checks
//		n=2 so it went to  first if-condition n==0||n==1 false
//		so it went to for-loop 
//	    i=2--->2<2--false so it will come out from that loop and return true
//	    2 is prime so it will print
//		so it comes to findfactor method 2 is a prime 
//		output:- 2
//	after coming out from method main method i will increment
	

//	-------------------------------------------------------------------------------------
	
//n=5
//it went to findfactor method
//		i=-->3<=5-->true
//		so it went to if-condtion--->n%i==0-->5%1-->
//		3)5(1
//		  3
//		 ----
//		  2
//		2==0 so false
//		it went to if-condition-->isprime(i)-->it went to isprime
//		there it checks
//		n=3 so it went to  first if-condition n==0||n==1 false
//		so it went to for-loop 
//	    i=2--->2<3--true --it went to if-condition-->n%i==0---3%2==0-->1==0 false 
//	    i=3---3<3--false 
//	   so it will come out from that loop and return true
//	    3 is prime so it will print
//		so it comes to findfactor method 3 is a prime 
//	    output sum:- 2+3=6
//		output:- 2 3
//	after coming out from method main method i will increment
	
	
//	-------------------------------------------------------------------------------------
	
	//n=5
	//it went to findfactor method
//			i=-->4<=5-->true
//			so it went to if-condtion--->n%i==0-->5%1-->
//			4)5(1
//			  3
//			 ----
//			  2
//			2==0 so false
//			it went to if-condition-->isprime(i)-->it went to isprime
//			there it checks
//			n=4 so it went to  first if-condition n==0||n==1 false
//			so it went to for-loop 
//		    i=2--->2<4--false --it went to if-condition-->n%i==0---4%2==0-->0==0 true 
//		    	
//		   so it will come out from that loop and return false
//		    4 is  not prime so it will print
//			so it comes to findfactor method 4 is not print
//		    output sum:- 2+3=6
//			output:- 2 3
//	after coming out from method main method i will increment
	
	
	//n=5
		//it went to findfactor method
//				i=-->5<=5-->true
//				so it went to if-condtion--->n%i==0-->5%1-->
//				5)5(1
//				  5
//				 ----
//				  0
//				5==0 so false
//				it went to if-condition-->isprime(i)-->it went to isprime
//				there it checks
//				n=4 so it went to  first if-condition n==0||n==1 false
//				so it went to for-loop 
//			    i=2--->2<5--false --it went to if-condition-->n%i==0---5%2==0-->2==0 false 
//	            i=3--->3<5--false --it went to if-condition-->n%i==0---5%3==0-->1==0 false 
//	            i=4--->4<5--false --it went to if-condition-->n%i==0---5%4==0-->2==0 false 
//	            i=5--->5<5--false 
//			    	
//			   so it will come out from that loop and return true
//			    5 is   prime so it will print
//				so it comes to findfactor method 5 is  print
//			    output sum:- 2+3=6+5=10
//				output:- 2 3 5
//		after coming out from method main method i will increment
	
	
}

