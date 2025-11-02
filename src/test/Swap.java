package test;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Swap_using_3rd_variable();
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter the first integer: ");
		int a = scan.nextInt();
		System.out.println("Enter the secomd integer: ");
		int b = scan.nextInt();
		
		a = a+b;
		 b=a-b;
		 a=a-b;
		 
		 System.out.println(a+","+b);
	}
	
	static void Swap_using_3rd_variable() {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter the first integer: ");
		int a = scan.nextInt();
		System.out.println("Enter the secomd integer: ");
		int b = scan.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		
		 System.out.println(a+","+b);
		
	}

}
