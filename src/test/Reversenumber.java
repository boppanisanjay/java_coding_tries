package test;

import java.util.Scanner;

public class Reversenumber {
	/*Reverse an entered number using for loop and while loop 

Input: 87561 

Output: 16578 

Input: 888555 

Output: 555888 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scan.nextInt();
		
		int original =n;
		
		
		int count =0;
		int temp =n;
		while(temp!=0) {
			temp = temp/10;
			count++;
		}
		System.out.println(count);
		
		int reverse =0;
		temp =n;
		while(temp!=0) {
			int digit = temp%10;
			reverse = (reverse*10) ;
			temp/=10;
		}
		System.out.println(reverse);
		
		int reverse_for = 0;
		for(int i=original; i!=0; i/=10) {
			reverse_for = (reverse_for*10) + (original%10);
			original/=10;
		}
		System.out.println(reverse_for);

	}


}
