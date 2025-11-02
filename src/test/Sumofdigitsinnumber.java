package test;

import java.util.Scanner;

public class Sumofdigitsinnumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number: ");
		int a =scan.nextInt();
		
		int sum =0;
		int temp =0;
		for(int i=0;a!=0;i++) {
			temp = a%10;
			sum=sum+temp;
			a=a/10;
		}
		System.out.println(sum);
		
	}

}
