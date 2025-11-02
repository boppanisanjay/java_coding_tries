package test;

import java.util.Scanner;

public class Fibonacci {
	/*Output the value of nth number in Fibonacci series 

Input: 12 

Output: 89 */

	public static void main(String[] args) {
		try1();
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int n = scan.nextInt();

		int a=0;
		int b=1;
		System.out.print(a+", "+b);
		for(int i=0;i<n-2;i++) {
			int c=a;
			a=b;
			b=c+b;
			System.out.print(", "+b);
		}

	}

	public static void try1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scan.nextInt();
		
		int first =0;
		int second =1;
		System.out.print(first+", "+second);
		for(int i=0;i<n-2;i++) {
			int next = first+second;
			first = second;
			second = next;
			System.out.print(", "+next);
		}
	}

}
