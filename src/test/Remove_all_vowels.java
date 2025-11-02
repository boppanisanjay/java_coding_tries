package test;

import java.util.Scanner;

public class Remove_all_vowels {
	//Remove all vowels from a given string.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String a = scan.next();
		a=a.toLowerCase();
		
		String result ="";
		
		int length = a.length();
		for(int i=0;i<length;i++) {
			char character = a.charAt(i);
			if(!(character == 'a' || character == 'e' ||character == 'i' ||character == 'o' ||character == 'u' )) {
				result = result+character;
			}
			
		
		}
		System.out.println(result);
		
	}

}
