package test;

import java.util.Scanner;

public class Fibinnaci {
	//Print the Fibonacci series up to a given number.

	public static void main(String[] args) {
		fibonacci();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		
		int a=0;
		int b=1;
		int c;
		System.out.print(a+"," +b);
		for(int i=1;i<=n;i++) {
			c=a;
			a=b;
			b=c+b;
			System.out.print(","+b);
		}
	}
	
	 public static void fibonacci() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the number of terms: ");
	        int n = scan.nextInt();

	        int a = 0;
	        int b = 1;

	        System.out.print("Fibonacci Series: ");

	        if (n == 1) {
	            System.out.print(a);
	        } else if (n >= 2) {
	            System.out.print(a + ", " + b);
	            for (int i = 2; i < n; i++) {
	                int c = a + b;
	                System.out.print(", " + c);
	                a = b;
	                b = c;
	            }
	        }
	        System.out.println();
	    }

}
