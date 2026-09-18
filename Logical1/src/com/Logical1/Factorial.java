package com.Logical1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Factorial f=new Factorial();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value:- ");
		int n=sc.nextInt();
		
		f.findfactorial(n);
		
		sc.close();
		
	}
	
	void findfactorial(int n) {
		
		int fact=1;
		
		for(int i=1; i<=n; i++) {
			
			fact*=i;
			
//			i=1--->it is initialization and starting number---->first step
//			i<=n-->it is condition and where it need to end---->second step
//			System.out.print(i+" "); //-----> third step
//			i=i+1/i++/i=i-1/i----->increment/decrement-----> fourth step

			
			System.out.print(fact+" ");
			
//			by given inside loop it will print below
			
//			fact=1, i=1- 1<=5-true--
//			1*=1=1
//			1
			
//			fact=1, i=2- 2<=5-true--
//			1*=2=2
//			2


//			fact=2, i=3- 3<=5-true--
//			2*=3=6
//			6
			
			
//			fact=6, i=4- 4<=5-true--
//			6*=4=24
//			24
			
//			fact=24, i=5- 5<=5-true--
//			24*=5=120
//			120
			
//      it will print 1 2 6 24 120
			
			
		}
		
//		if we give outside of loop it will print exact factorial number of n
		
//		System.out.print(fact);
	}

}
