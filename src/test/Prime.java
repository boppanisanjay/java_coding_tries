package test;

import java.util.Scanner;

public class Prime {

	//Check if a number is prime or not.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = scan.nextInt();
		
		if(a==2) {
			System.out.println("given number is prime: "+ a);
		}
		if(a<=1) {
			System.out.println("non prime");
		}
		
		boolean primestatus = true;
		for(int i =2;i<a;i++) {
			if(a%i==0) {
				primestatus = false; 
			}
		}
		if(primestatus) {
			System.out.println("prime");
		}
		else {
			System.out.println("non-prime");
		}

	}

}
