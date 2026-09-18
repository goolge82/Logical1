package com.Logical1;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {

//		Perfect p=new Perfect();

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the value:- ");
		int n = sc.nextInt();

		boolean flag = isperfect(n);

		if (flag) {
			System.out.println("it is perfect");
		} else {
			System.out.println("it is not perfect");
		}

		sc.close();

	}

	static boolean isperfect(int n) {

		boolean flag = false;

		int sum = 0;

//		i=1--->it is initialization and starting number---->first step
//		i<=n-->it is condition and where it need to end---->second step
//		System.out.print(i+" "); //-----> third step
//		i=i+1/i++/i=i-1/i----->increment/decrement-----> fourth step

		for (int i = 1; i <=n; i++) {
			if (n%i == 0) {
				sum = sum + i;

				System.out.print(i + " ");

			}
		}

		if (sum == n) {
			flag = true;
		}
		return flag;

//				i=1- 1<6-6%1=0(here 0==0) so true
//				sum=0+1=1
//				1==6--->false;

//				i=2- 2<6-6%2=0(here 0==0) so true
//				sum=1+2=3
//				3==6--->false;

//				i=3- 3<6-6%3=0(here 0==0) so true
//				sum=3+3=6
//				6==6--->true;

//				here if condition satisfy only then it moves to add and move to outside if condition
//				other wise sum will remains as 6 only

//				i=4- 4<6-6%4=2(here 2==0) so false
//				sum is 6
//				6==6--->true;

//				i=5- 5<6-6%5=1(here 1==0)  so false
//				sum is 6
//				6==6--->true;

//				i=6 - 6<6-->false here loop will stop				

//				by adding 1+2+3=6
//				6==6 so it became perfect number
		

	}

}
