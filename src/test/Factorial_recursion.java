package test;

import java.util.Scanner;

public class Factorial_recursion {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case
        } else {
            return n * factorial(n - 1); // recursive call
        }
    }

    static int factorial1(int n) {
    	
    	int fact = 1;
    	for(int i=n ;i>=1;i--) {
    		fact = fact*i;
    	}
    	System.out.println("fact: "+fact);
    	return fact;
    	
    }
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a= scan.nextInt();
        System.out.println(factorial(a));
        System.out.println(factorial1(a));
    }
}
