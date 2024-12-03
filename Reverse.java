package com;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int n =sc.nextInt();
		int rev=0;
		do {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}while(n!=0);
		System.out.println(rev);
	}
}
//int n =sc.nextInt();
//int rev=0;
//while(n>0) {
//int d=n%10;
//System.out.println(rev);
//n=n/10;

