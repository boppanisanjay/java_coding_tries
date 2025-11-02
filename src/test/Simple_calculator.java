package test;

import java.util.Scanner;

public class Simple_calculator {
	
	static int add(int a, int b) {
		return(a+b);
	}
	
	static int substract(int a, int b) {
		return (a-b);
	}
	
	static int multiplication(int a, int b) {
		return (a*b);
	}
	
	static int division(int a, int b) {
		return (a/b);
	}
	
	static int notsure(int a, int b, String calc_type) {
			
		
		switch(calc_type) {
		case "multiplication" : return(a*b);
		case "addition" : return (a+b); 
		case "subtraction" : return(a-b); 
		case "divison" : return(a/b); 
		 default:
	            System.out.println("Invalid calculation type.");
	            return 0;
		}
		
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(notsure(25,5,"addition"));
		
	}

}
