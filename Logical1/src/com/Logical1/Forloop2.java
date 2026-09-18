package com.Logical1;

import java.math.BigInteger;
import java.util.Scanner;

public class Forloop2 {

	public static void main(String[] args) {

		
//		1.Write a Java program to print numbers from 1 to 20 using a for loop.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a value:- ");
		 BigInteger n = new BigInteger("5");
	
		
		//int
//		for(int i=0; i<=n; i=i+1) {
//			System.out.println(i+" ");
//		}
		
		
		//byte
//		for(byte i=0; i<=n; i=(byte) (i+1)) {
//			System.out.println(i+" ");
//		}
		
		
		//short
//		for(short i=0; i<=n; i=(short) (i+1)) {
//			System.out.println(i+" ");
//		}
		
		//long
		
//		for(long i=0; i<=n; i=i+1) {
//			System.out.println(i+" ");
//		}
		
		
		//char
		
//		for(char i=0; i<=n; i=(char) (i+1)) {
//			System.out.println(i+" ");
//		}
		
//		for(char i=0; i<=n;i++) {
//			System.out.println(i+" ");
//		}
		
		
		//float
//		for(float i=0; i<=n; i=i+1) {
//			System.out.println(i+" ");
//		}
		
		//double
		
//		for(double i=0; i<=n; i=i+1) {
//			System.out.println(i+" ");
//		}
		
		
		//biginteger
		
		 for (BigInteger i = BigInteger.ZERO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
	            System.out.println(i);
	        }
		 
		 sc.close();
		
	}

}
