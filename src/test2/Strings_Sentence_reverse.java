package test2;

 /*
	Modify your code to reverse only the order of words, not the characters.
	Example: "I love Java" → "Java love I"
	Reverse only alternate words in a sentence.
	Reverse the first half of a string.
	Write a program to check if a string is a palindrome.
	Reverse a string without using loops (using recursion).
	Reverse a string without using StringBuilder or extra variables.
	How would you reverse words separated by multiple spaces or tabs?
	Modify the program to handle punctuations correctly.
	Example: "Hello, world!" → "world! Hello,"
	Reverse only the vowels in a string.
	Reverse a substring between given indexes.
  */

import java.util.Scanner;

public class Strings_Sentence_reverse {
	
	public static void string_reverse() {

		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter the string: ");
		String a = scan.next();
		
		int len = a.length();
		String reverse_str = "";
			for(int i=len-1;i>=0;i--) {
				char character = a.charAt(i);
				reverse_str = reverse_str+character;
			}		
			System.out.println(reverse_str);
	}
	private static void sentence_reverse() {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter the sentence: ");
		String a = scan.nextLine();
		
		int len = a.length();
		String reverse_sen = "";
		for(int i=len-1;i>=0;i--) {
			char character = a.charAt(i);
			reverse_sen = reverse_sen+character;
		}
		System.out.println("sentence reverse: "+reverse_sen);

	}
	
	public static void words_in_sentence_reverse() {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter the sentence: ");
		String a = scan.nextLine();
		
		String arr[] =a.split(" "); 
		String output ="";
		
		for(String s:arr) {
			int len = s.length();
			String rev_string = "";
			for(int i=len-1;i>=0;i--) {
				char character = s.charAt(i);
				rev_string = rev_string+character;
			}		
			output=output+rev_string+" ";
		}
		System.out.println(output);	
	}
	
	private static void reverse_order_of_words_in_sentence() {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter the sentence: ");
		String a = scan.nextLine();
		
		String arr[]= a.split(" ");
		String output = "";
		for(int i = arr.length-1;i>=0;i--) {
			String str = arr[i];
			output = output+str+" ";
		}
		System.out.println(output);
	}
	private static void reverse_ony_alternate_words() {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter the sentence: ");
		String a = scan.nextLine();
		
		String arr[]= a.split(" ");
		String output = "";
		String rev_arr[]= new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			
			if(i%2==0) {
				String reverse_string = "";
				for(int j=arr[i].length()-1;j>=0;j--) {
					char character = arr[i].charAt(j);
					reverse_string = reverse_string + character;
					
				}
				rev_arr[i]=reverse_string;
			}
			else {
			rev_arr[i]= arr[i];			
		}
		}
		
		for(String s : rev_arr) {
			output=output+s+" ";
		}
		System.out.println(output);

	}
	
	
	public static void main(String[] args) {
		//string_reverse();
		//sentence_reverse();
		//words_in_sentence_reverse();
		//reverse_order_of_words_in_sentence();
		//reverse_ony_alternate_words();
	}
}
